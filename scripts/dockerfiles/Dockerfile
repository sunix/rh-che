# Copyright (c) 2012-2017 Red Hat, Inc
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Eclipse Public License v1.0
# which accompanies this distribution, and is available at
# http://www.eclipse.org/legal/epl-v10.html
FROM rhche/che-server:nightly
RUN rm /home/user/eclipse-che* -rf
ADD eclipse-che.tar.gz /home/user/
RUN chmod -R 0777 /home/user/

