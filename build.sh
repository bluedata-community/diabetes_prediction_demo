
# Download application jar file
curl -LJ0 https://github.com/snowch/diabetes_prediction_demo/tarball/v0.0.1 > app.jar

# build image
docker build -t db-demo:0.0.1 .
