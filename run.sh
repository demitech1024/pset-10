#!/bin/bash
dir=$(pwd -P)

javac -d bin -classpath $dir/lib/gson-2.8.2.jar ./src/*/*.java
java -classpath $dir/bin:$dir/lib/gson-2.8.2.jar application.Dictionary
