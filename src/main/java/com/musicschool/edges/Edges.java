package com.musicschool.edges;

import com.musicschool.nodes.Nodes;
import com.musicschool.schema.MusicSchoolComponent;

public class Edges <T extends MusicSchoolComponent, U extends MusicSchoolComponent> {
    Nodes<T> from;
    Nodes<U> to;
}
