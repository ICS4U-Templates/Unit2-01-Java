# **NOTE: This directory holds the files to Lint your code.**

- To run the Java linter in the root directory:
```shell
java -jar ./linter/checkstyle.app -c ./linter/sun_checks.xml *.java
```
- To run the Github Super Linter locally, in a docker container using act:
```shell
act -P catthehacker/docker_images -s GITHUB_TOKEN="$(gh auth token)" -v
```