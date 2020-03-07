#!/bin/bash

javac -classpath './src/' ./src/*/*.java
java -classpath './src/' controller.Application
