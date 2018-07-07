package com.architectawesome.cornerstone.parsexml.completedemo2_abetterway.mutipleObject.model;

import java.util.List;

/**
 * Created by renwujie on 2018/07/03 at 15:19
 */
public class Computers {
    private List<Computer> computer;

    public Computers() {
    }

    public Computers(List<Computer> computer) {
        this.computer = computer;
    }

    public List<Computer> getComputer() {
        return computer;
    }

    public void setComputer(List<Computer> computer) {
        this.computer = computer;
    }

    @Override
    public String toString() {
        return "Computers{" +
                "computer=" + computer +
                '}';
    }
}
