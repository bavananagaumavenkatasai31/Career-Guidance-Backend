package com.careerguidance.model;

import java.util.List;

public class CareerPath {

    private String career;
    private String description;
    private List<String> studyTopics;
    private List<String> skills;
    private List<String> preparation;
    private List<String> roadmap;
    private List<String> resources;

    public CareerPath() {
    }

    public CareerPath(
            String career,
            String description,
            List<String> studyTopics,
            List<String> skills,
            List<String> preparation,
            List<String> roadmap,
            List<String> resources) {

        this.career = career;
        this.description = description;
        this.studyTopics = studyTopics;
        this.skills = skills;
        this.preparation = preparation;
        this.roadmap = roadmap;
        this.resources = resources;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getStudyTopics() {
        return studyTopics;
    }

    public void setStudyTopics(List<String> studyTopics) {
        this.studyTopics = studyTopics;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public List<String> getPreparation() {
        return preparation;
    }

    public void setPreparation(List<String> preparation) {
        this.preparation = preparation;
    }

    public List<String> getRoadmap() {
        return roadmap;
    }

    public void setRoadmap(List<String> roadmap) {
        this.roadmap = roadmap;
    }

    public List<String> getResources() {
        return resources;
    }

    public void setResources(List<String> resources) {
        this.resources = resources;
    }
}