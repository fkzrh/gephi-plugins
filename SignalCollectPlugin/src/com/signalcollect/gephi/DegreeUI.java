/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.signalcollect.gephi;

import javax.swing.JPanel;
import org.gephi.statistics.spi.Statistics;
import org.gephi.statistics.spi.StatisticsUI;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author flaviokeller
 */
@ServiceProvider(service = StatisticsUI.class)
public class DegreeUI implements StatisticsUI {

    private DegreePanel panel;
    private Degree degree;

    @Override
    public JPanel getSettingsPanel() {
        panel = new DegreePanel();
        return panel;
    }

    public void setup(Statistics statistics) {
   this.degree = (Degree) statistics;
   if(panel!=null) {
      panel.setDirected(degree.isDirected());
   }
 }
 
 public void unsetup() {
   if(panel!=null) {
      degree.setDirected(panel.isDirected());
   }
   panel = null;
 }
    @Override
    public Class<? extends Statistics> getStatisticsClass() {
        return Degree.class;
    }

    @Override
    public String getValue() {
        return degree.getReport();
    }

    @Override
    public String getDisplayName() {
        return "SCDegree";
    }

    @Override
    public String getShortDescription() {
        return "Hello Signal/Collect";
    }

    @Override
    public String getCategory() {
        return StatisticsUI.CATEGORY_NETWORK_OVERVIEW;
    }

    @Override
    public int getPosition() {
        return 800;
    }

}
