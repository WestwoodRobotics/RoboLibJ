#!/bin/bash

ant javadoc

rm -rf ../robolib.github.io/robolibj/docs

cp -rf docs ../robolib.github.io/robolibj/
echo "Done"
