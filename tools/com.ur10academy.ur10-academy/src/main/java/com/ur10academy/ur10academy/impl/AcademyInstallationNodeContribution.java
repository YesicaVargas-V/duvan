
package com.ur10academy.ur10academy.impl;

import com.ur.urcap.api.contribution.InstallationNodeContribution;
import com.ur.urcap.api.domain.data.DataModel;
import com.ur.urcap.api.domain.script.ScriptWriter;

public class AcademyInstallationNodeContribution
        implements InstallationNodeContribution {

    private final DataModel model;

    public AcademyInstallationNodeContribution(DataModel model) {
        this.model = model;
    }

    @Override
    public void openView() {
    }

    @Override
    public void closeView() {
    }

    public boolean isDefined() {
        return true;
    }

    @Override
    public void generateScript(ScriptWriter writer) {
    }
}
