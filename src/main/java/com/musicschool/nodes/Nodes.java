package com.musicschool.nodes;

import com.musicschool.edges.Edges;
import com.musicschool.schema.MusicSchoolComponent;

import java.util.HashSet;

public class Nodes <T extends MusicSchoolComponent/*, U extends MusicSchoolComponent*/> {
    T elem;
    HashSet<HashSet<Nodes<? extends MusicSchoolComponent>>> foreignKeys; // pensa
}
