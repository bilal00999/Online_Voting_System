package View;

import javax.swing.*;
import java.awt.*;

public class PartiesPanel extends JPanel {
    private final String[][] parties = {
            {"Alpha Party", "A new vision for the future."},
            {"Beta Party", "Equality & Progress."},
            {"Gamma Party", "Innovation and Growth."}
    };

    public PartiesPanel(VotingSystemUI parent) {
        setLayout(new BorderLayout());
        setBackground(new Color(255, 250, 240));

        JLabel title = new JLabel("Parties", SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 26));
        title.setBorder(BorderFactory.createEmptyBorder(25,0,20,0));

        JPanel list = new JPanel();
        list.setOpaque(false);
        list.setLayout(new GridLayout(parties.length, 1, 15, 15));
        list.setBorder(BorderFactory.createEmptyBorder(20,60,20,60));

        for (String[] party : parties) {
            JPanel panel = new JPanel(new BorderLayout());
            panel.setBackground(new Color(250, 250, 210));
            panel.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(200,200,170)),
                    BorderFactory.createEmptyBorder(12,12,12,12)
            ));

            JLabel name = new JLabel(party[0]);
            name.setFont(new Font("Segoe UI", Font.BOLD, 17));
            JLabel desc = new JLabel("<html><small>" + party[1] + "</small></html>");
            desc.setFont(new Font("Segoe UI", Font.PLAIN, 13));
            desc.setForeground(new Color(60,60,60));

            panel.add(name, BorderLayout.NORTH);
            panel.add(desc, BorderLayout.CENTER);

            list.add(panel);
        }

        JButton backBtn = new JButton("Back");
        backBtn.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        backBtn.addActionListener(e -> parent.showScreen("MainMenu"));
        JPanel botPanel = new JPanel();
        botPanel.setOpaque(false);
        botPanel.add(backBtn);

        add(title, BorderLayout.NORTH);
        add(list, BorderLayout.CENTER);
        add(botPanel, BorderLayout.SOUTH);
    }
}