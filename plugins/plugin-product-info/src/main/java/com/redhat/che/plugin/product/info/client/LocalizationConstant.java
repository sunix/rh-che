/*
 * Copyright (c) 2016-2017 Red Hat, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package com.redhat.che.plugin.product.info.client;

import com.google.gwt.i18n.client.Messages;

/**
 * Constants for OpenShift product info
 *
 * @author Florent Benoit
 */
public interface LocalizationConstant extends Messages {

  @Key("che.tab.title")
  String cheTabTitle();

  @Key("che.tab.title.with.workspace.name")
  String cheTabTitle(String workspaceName);

  @Key("get.support.link")
  String getSupportLink();

  @Key("get.product.name")
  String getProductName();

  @Key("support.title")
  String supportTitle();
}
