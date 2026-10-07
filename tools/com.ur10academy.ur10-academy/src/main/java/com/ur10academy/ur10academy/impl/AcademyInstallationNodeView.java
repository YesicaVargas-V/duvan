
package com.ur10academy.ur10academy.impl;

import com.ur.urcap.api.contribution.installation.swing.SwingInstallationNodeView;

import javax.swing.*;
import java.awt.*;

public class AcademyInstallationNodeView
        implements SwingInstallationNodeView<AcademyInstallationNodeContribution> {

    private JPanel mainPanel;

    @Override
    public void buildUI(
            JPanel panel,
            AcademyInstallationNodeContribution contribution) {

        mainPanel = panel;

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(createHeader());
        panel.add(createSpacing(20));

        panel.add(createWelcomeSection());
        panel.add(createSpacing(20));

        panel.add(createModulesSection());

        panel.add(Box.createVerticalGlue());
    }

    private JPanel createHeader() {

        JPanel header = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JLabel title = new JLabel("AUTOMATE ACADEMY");

        title.setFont(new Font("SansSerif", Font.BOLD, 24));

        header.add(title);

        header.setAlignmentX(Component.LEFT_ALIGNMENT);

        return header;
    }

    private JPanel createWelcomeSection() {

        JPanel section = new JPanel();
        section.setLayout(new BoxLayout(section, BoxLayout.Y_AXIS));

        JLabel title = new JLabel("Aprende robótica industrial");

        title.setFont(new Font("SansSerif", Font.BOLD, 20));

        JLabel description = new JLabel(
                "Plataforma educativa para Universal Robots UR10e."
        );

        section.add(title);
        section.add(Box.createVerticalStrut(8));
        section.add(description);

        section.setAlignmentX(Component.LEFT_ALIGNMENT);

        return section;
    }

    private JPanel createModulesSection() {

        JPanel section = new JPanel();
        section.setLayout(new GridLayout(2, 2, 10, 10));

        section.add(createModuleCard("Fundamentos"));
        section.add(createModuleCard("Movimientos"));
        section.add(createModuleCard("Herramientas y TCP"));
        section.add(createModuleCard("Pick & Place"));

        section.setAlignmentX(Component.LEFT_ALIGNMENT);

        return section;
    }

    private JPanel createModuleCard(String name) {

        JPanel card = new JPanel();

        card.setBorder(
                BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(Color.GRAY),
                        BorderFactory.createEmptyBorder(15, 10, 15, 10)
                )
        );

        card.add(new JLabel(name));

        return card;
    }

    private Component createSpacing(int height) {
        return Box.createRigidArea(new Dimension(0, height));
    }
}