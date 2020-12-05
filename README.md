# Steps to run

1. Launch Mongo DB
   - Container can be launched using `docker run -p 27017:27017 mongo`
   - Connect to container using mongo://localhost:27017/mongodemo or `mongo://host.docker.internal:27017/mongodemo`
2. Update Mongo URL in properties file
3. Launch Spring boot code
4. Test Endpoints through `test.http`
