
# Download application jar file
curl -LJ0 https://github.com/snowch/diabetes_prediction_demo/releases/download/v0.0.1/foo-1.0.0.BUILD-SNAPSHOT-exec.jar > app.jar

# build image
docker build -t db-demo:0.0.1 .
