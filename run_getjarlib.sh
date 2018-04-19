rm -rf  /tmp/lib 
rm -rf ./tmp_lib
mkdir -p /tmp/lib 
mvn clean dependency:copy-dependencies
mkdir -p ./tmp_lib
mv /tmp/lib/* ./tmp_lib
