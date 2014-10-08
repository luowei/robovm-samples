/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.samples.contractr.ios;

import org.robovm.samples.contractr.core.Client;
import org.robovm.samples.contractr.core.ClientModel;

/**
 * 
 */
public class AddClientViewController extends AbstractClientViewController {
    
    private final ClientModel clientModel;

    public AddClientViewController(ClientModel clientModel) {
        this.clientModel = clientModel;
    }

    @Override
    public void viewDidLoad() {
        super.viewDidLoad();
        
        getNavigationItem().setTitle("Add client");
    }
    
    @Override
    protected void onSave() {
        Client client = saveViewValuesToClient(clientModel.create());
        clientModel.save(client);
        super.onSave();
    }
    
}
