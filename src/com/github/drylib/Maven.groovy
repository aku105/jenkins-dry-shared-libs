package com.github.drylib;

// Execute any Maven phases passed
def executePhases(String phases){
    def jdkName = 'jdk'
    def mavenName = 'maven'

    stage("Maven ${phases}"){
        withEnv(["JAVA_HOME=${ getToolPath(jdkName) }", "PATH+MAVEN=${ getToolPath(mavenName) }/bin:${env.JAVA_HOME}/bin"]) {
            sh "mvn ${phases}"
        }
    }
}

// tool() is in-built and returns the installation path of tool name
def getToolPath(String toolName) {
    try {
        return tool(toolName)
    } catch (Exception ex) {
        error "The tool ${toolName} doesn't exist"
    }
}