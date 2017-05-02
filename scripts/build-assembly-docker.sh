#!/bin/bash

set -e

CURRENT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

[ -f ${CURRENT_DIR}/dockerfiles/eclipse-che.tar.gz ] && rm ${CURRENT_DIR}/dockerfiles/eclipse-che.tar.gz

cp ${CURRENT_DIR}/../assembly/assembly-main/target/eclipse-che-5.6.0-openshift-connector-fabric8-SNAPSHOT.tar.gz ${CURRENT_DIR}/dockerfiles/eclipse-che.tar.gz

docker build -t rhche/che-server:develop ${CURRENT_DIR}/dockerfiles/

