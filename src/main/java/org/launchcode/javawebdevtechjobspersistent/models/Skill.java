package org.launchcode.javawebdevtechjobspersistent.models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

public class Skill extends AbstractEntity {

    @Size(max = 500, message = "Description too long!")
    String description;

}