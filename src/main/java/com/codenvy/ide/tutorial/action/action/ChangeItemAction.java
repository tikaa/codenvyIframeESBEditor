/*
 * CODENVY CONFIDENTIAL
 * __________________
 * 
 * [2012] - [2013] Codenvy, S.A. 
 * All Rights Reserved.
 * 
 * NOTICE:  All information contained herein is, and remains
 * the property of Codenvy S.A. and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Codenvy S.A.
 * and its suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Codenvy S.A..
 */
package com.codenvy.ide.tutorial.action.action;

import com.codenvy.ide.api.ui.action.Action;
import com.codenvy.ide.api.ui.action.ActionEvent;
import com.codenvy.ide.tutorial.action.ActionTutorialResources;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import static com.codenvy.ide.tutorial.action.ActionTutorialExtension.SHOW_ITEM;

/**
 * The action for changing visibility and availability of other items.
 *
 * @author <a href="mailto:aplotnikov@codenvy.com">Andrey Plotnikov</a>
 */
@Singleton
public class ChangeItemAction extends Action {

    @Inject
    public ChangeItemAction(ActionTutorialResources resources) {
        super("Change visibility and availability", "The action for changing visibility and availability of other items",
              resources.item());
    }

    /** {@inheritDoc} */
    @Override
    public void actionPerformed(ActionEvent e) {
        SHOW_ITEM = !SHOW_ITEM;
    }
}