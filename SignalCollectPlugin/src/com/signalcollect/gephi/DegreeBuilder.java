/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.signalcollect.gephi;

import org.gephi.statistics.spi.Statistics;
import org.gephi.statistics.spi.StatisticsBuilder;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author flaviokeller
 */
@ServiceProvider(service = StatisticsBuilder.class)
public class DegreeBuilder implements StatisticsBuilder {

    @Override
    public String getName() {
        return "SignalCollectDegree";
    }

    @Override
    public Statistics getStatistics() {
        return new Degree();
    }

    @Override
    public Class<? extends Statistics> getStatisticsClass() {
        return Degree.class;
    }
    
}
