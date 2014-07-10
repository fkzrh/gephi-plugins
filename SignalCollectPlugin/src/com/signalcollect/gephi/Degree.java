/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.signalcollect.gephi;

import org.gephi.data.attributes.api.AttributeModel;
import org.gephi.graph.api.Graph;
import org.gephi.graph.api.GraphModel;
import org.gephi.graph.api.Node;
import org.gephi.statistics.spi.Statistics;
import org.gephi.utils.progress.Progress;
import org.gephi.utils.progress.ProgressTicket;

/**
 *
 * @author flaviokeller
 */
public class Degree implements Statistics {

    private boolean directed;
    private boolean cancel = false;
    private ProgressTicket progressTicket;

    @Override
    public void execute(GraphModel gm, AttributeModel am) {
        
        Graph graph = gm.getGraphVisible();
        graph.readLock();

        try {
            Progress.start(progressTicket, graph.getNodeCount());

            for (Node n : graph.getNodes()) {
                //do something
                Progress.progress(progressTicket);
                if (cancel) {
                    break;
                }
            }
            graph.readUnlockAll();
        } catch (Exception e) {
            e.printStackTrace();
            //Unlock graph
            graph.readUnlockAll();
        }
    }

    @Override
    public String getReport() {
        
     //   ch.uzh.ifi.ddis.signalcollect.Degree d;
        
        Integer i = new Integer(1);
//        DegreeVertex dd = new DegreeVertex(i, 2);
//        String answer = dd.state().toString();
        return "Hello Signal/Collect";
    }

    public boolean cancel() {
        cancel = true;
        return true;
    }

    public void setProgressTicket(ProgressTicket progressTicket) {
        this.progressTicket = progressTicket;
    }

    public boolean isDirected() {
        return directed;
    }

    public void setDirected(boolean b) {
        directed = b;
    }
}
