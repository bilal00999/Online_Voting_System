package View;

import javax.swing.*;
import java.awt.*;

public class ResultPanel extends JPanel {
    // Sample data
    private final String[] parties = {"Alpha Party", "Beta Party", "Gamma Party"};
    private final int[] votes = {42, 30, 18};

    public ResultPanel(VotingSystemUI parent) {
        setLayout(new BorderLayout());
        setBackground(new Color(240,245,255));

        JLabel title = new JLabel("Results", SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 26));
        title.setBorder(BorderFactory.createEmptyBorder(25,0,20,0));

        JPanel chartPanel = new BarChartPanel(parties, votes);

        JButton backBtn = new JButton("Back");
        backBtn.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        backBtn.addActionListener(e -> parent.showScreen("MainMenu"));
        JPanel botPanel = new JPanel();
        botPanel.setOpaque(false);
        botPanel.add(backBtn);

        add(title, BorderLayout.NORTH);
        add(chartPanel, BorderLayout.CENTER);
        add(botPanel, BorderLayout.SOUTH);
    }

    // Inner class for bar chart
    static class BarChartPanel extends JPanel {
        private final String[] parties;
        private final int[] votes;

        public BarChartPanel(String[] parties, int[] votes) {
            this.parties = parties;
            this.votes = votes;
            setPreferredSize(new Dimension(400, 300));
            setOpaque(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (votes.length == 0) return;

            int width = getWidth(), height = getHeight();
            int margin = 50, barWidth = 60, gap = 30;
            int maxVote = 0;
            for (int v : votes) maxVote = Math.max(maxVote, v);
            int chartHeight = height - 2 * margin;

            for (int i = 0; i < votes.length; i++) {
                int barHeight = maxVote == 0 ? 0 : (votes[i] * chartHeight) / maxVote;
                int x = margin + i * (barWidth + gap);
                int y = height - margin - barHeight;
                Color color = switch (i) {
                    case 0 -> new Color(25,118,210);
                    case 1 -> new Color(56,142,60);
                    default -> new Color(251,192,45);
                };
                g.setColor(color);
                g.fillRoundRect(x, y, barWidth, barHeight, 12, 12);

                g.setColor(Color.BLACK);
                g.drawString(parties[i], x, height - margin + 18);
                g.drawString(String.valueOf(votes[i]), x + barWidth/2 - 10, y - 8);
            }

            // Y-Axis line
            g.setColor(Color.GRAY);
            g.drawLine(margin-10, height-margin, margin + votes.length*(barWidth+gap)-gap, height-margin);
        }
    }
}