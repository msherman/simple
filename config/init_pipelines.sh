#!/bin/bash
fly --target pip login --concourse-url http://127.0.0.1:8080 -u test -p test
fly -t pip sp -p simple-split -c pipeline-split.yml
fly -t pip sp -p simple-serial -c pipeline-serial.yml
fly -t pip sp -p simple-combined-tasks -c pipeline-combined-tasks.yml
fly -t pip sp -p simple-minimal -c pipeline-minimal.yml