

package com.ur10academy.ur10academy.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.ur.urcap.api.contribution.installation.swing.SwingInstallationNodeService;

public class Activator implements BundleActivator {

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        bundleContext.registerService(
            SwingInstallationNodeService.class,
            new AcademyInstallationNodeService(),
            null
        );

        System.out.println("UR10 Academy iniciada.");
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("UR10 Academy detenida.");
    }
}