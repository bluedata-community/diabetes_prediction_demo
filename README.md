## Usage

### Deploying app on BlueData

- Provision a Centos 7 cluster
- ssh into the centos cluster as an admin user and run:

```
sudo yum install java-1.8.0-openjdk
wget https://github.com/snowch/diabetes_prediction_demo/releases/latest/download/db-demo-app-exec.jar

export BLUEDATA_MLOPS_URI=http://host:port/model_name/model_version/predict
export BLUEDATA_MLOPS_XAUTHTOKEN=your_token

nohup java -Dbluedata.mlops.uri=$BLUEDATA_MLOPS_URI -Dbluedata.mlops.xauthtoken=$BLUEDATA_MLOPS_XAUTHTOKEN -jar db-demo-app-exec.jar &
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
