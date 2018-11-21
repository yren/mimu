#!/usr/bin/env bash
mvn clean package -Dmaven.test.skip=true -Dmaven.javadoc.skip=true

echo "cp properties"
cp -f src/main/resources/*.properties /rt/properties
