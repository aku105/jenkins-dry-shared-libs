# Jenkins Shared Libraries - Modular pipeline as shared library

Various shared libraries for generic B&amp;R of various archtypes. Only Maven at the moment.

You will need to add this repo as shared library in Jenkins and create multiple stages using `mvn` task defined in the shared library (instead of `sh "mvn ..."`) in the Jenkins pipeline.

Good when different projects do unique steps across them and need uniquely created pipelines.

Not so good when multiple projects with same lifecycle, e.g. microservices that comprise a bigger service.
