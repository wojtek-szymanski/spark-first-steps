#!/usr/bin/env bash

spark-submit \
--class rdd.WordCount \
target/scala-2.11/spark-first-steps_2.11-1.0.jar \
input/apat63_99.txt \
output/apat63_99_wc
