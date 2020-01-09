[![Build Status](https://travis-ci.org/bluedata-community/diabetes_prediction_demo.svg?branch=master)](https://travis-ci.org/bluedata-community/diabetes_prediction_demo)

## Usage

### Ensure your Diabetes_Scoring.py script returns a computer readable value

The original demo scripts returns a human readable value, i.e.

```
print("Chances of having diabetes: " + str(pred) + "%")
```

This application expects a computer readable value, i.e.

```
print(str(pred))
```

See [./Diabetes_Scoring.py](./Diabetes_Scoring.py) 

### Deploying app on BlueData

- Provision a Centos 7 cluster
- ssh into the centos cluster as an admin user and run:

```
# !!! Change these to reflect your environment !!!

export BLUEDATA_MLOPS_URI=http://deployment_host:deployment_port/model_name/model_version/predict
export BLUEDATA_MLOPS_XAUTHTOKEN=your_token
```

then in the same ssh session, run the following on the centos cluster:

```
sudo yum -y install java-1.8.0-openjdk
sudo wget -O /home/bluedata/db-demo-app-exec.jar https://github.com/snowch/diabetes_prediction_demo/releases/latest/download/db-demo-app-exec.jar

# Create a system service to automatically restart the service on failure
sudo bash -c "cat >/etc/systemd/system/db-demo-app.service" <<EOF
[Unit]
Description=Diabetes Demo App
After=network.target

[Service]
Type=simple
Restart=always
RestartSec=1
User=bluedata
ExecStart=/usr/bin/java -Dbluedata.mlops.uri=$BLUEDATA_MLOPS_URI -Dbluedata.mlops.xauthtoken=$BLUEDATA_MLOPS_XAUTHTOKEN -jar /home/bluedata/db-demo-app-exec.jar

[Install]
WantedBy=multi-user.target
EOF

sudo systemctl start db-demo-app
sudo systemctl enable db-demo-app
sudo systemctl restart db-demo-app
```

You can check the webapp service status:

```
sleep 10                           # wait for service to start
curl http://localhost:8080/health  # should return {"status":"UP" ...}
```

On the BlueData Centos 7 cluster screen, click **Add a cluster service**:

- Service ID: 1
- Exported Service: webapp
- Service Name: webapp
- Service Description: webapp
- Port: 8080

Then hit Submit

You can now access the Diabetes Prediction Demo app using the BlueData gateway host and port.

### Deploying app on Docker

- See instructions at: https://hub.docker.com/repository/docker/snowch/db-demo
