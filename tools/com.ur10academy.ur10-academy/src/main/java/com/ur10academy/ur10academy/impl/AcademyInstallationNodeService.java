
package com.ur10academy.ur10academy.impl;

import java.util.Locale;

import com.ur.urcap.api.contribution.ViewAPIProvider;
import com.ur.urcap.api.contribution.installation.ContributionConfiguration;
import com.ur.urcap.api.contribution.installation.CreationContext;
import com.ur.urcap.api.contribution.installation.InstallationAPIProvider;
import com.ur.urcap.api.contribution.installation.swing.SwingInstallationNodeService;
import com.ur.urcap.api.domain.data.DataModel;

public class AcademyInstallationNodeService implements
        SwingInstallationNodeService<AcademyInstallationNodeContribution, AcademyInstallationNodeView> {

    @Override
    public void configureContribution(ContributionConfiguration configuration) {
        // Se utilizan los valores predeterminados.
    }

    @Override
    public String getTitle(Locale locale) {
        return "UR10 Academy";
    }

    @Override
    public AcademyInstallationNodeView createView(ViewAPIProvider apiProvider) {
        return new AcademyInstallationNodeView();
    }

    @Override
    public AcademyInstallationNodeContribution createInstallationNode(
            InstallationAPIProvider apiProvider,
            AcademyInstallationNodeView view,
            DataModel model,
            CreationContext context) {

        return new AcademyInstallationNodeContribution(model);
    }
}