package com.architectawesome.cornerstone.parsexml.lemontest.model;

import java.util.List;

/**
 * Created by renwujie on 2018/07/03 at 15:26
 */
public class RelationAlgs {
    private List<AlgrithmPackgePropertyRelation> relationAlg;

    public RelationAlgs() {
    }

    public RelationAlgs(List<AlgrithmPackgePropertyRelation> relationAlg) {
        this.relationAlg = relationAlg;
    }

    public List<AlgrithmPackgePropertyRelation> getRelationAlg() {
        return relationAlg;
    }

    public void setRelationAlg(List<AlgrithmPackgePropertyRelation> relationAlg) {
        this.relationAlg = relationAlg;
    }

    @Override
    public String toString() {
        return "RelationAlgs{" +
                "relationAlg=" + relationAlg +
                '}';
    }
}
