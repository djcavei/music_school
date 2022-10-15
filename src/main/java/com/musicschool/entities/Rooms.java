package com.musicschool.entities;

import com.musicschool.schema.MusicSchoolComponent;
import lombok.Builder;

@Builder
public class Rooms implements MusicSchoolComponent {
    private final String id;
}
