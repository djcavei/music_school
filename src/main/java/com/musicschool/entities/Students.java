package com.musicschool.entities;

import com.musicschool.schema.MusicSchoolComponent;
import lombok.Builder;

import java.util.Date;

@Builder
public class Students implements MusicSchoolComponent {
    private final String id;
    private String name;
    private String surname;
    private Date birthDate;
}
