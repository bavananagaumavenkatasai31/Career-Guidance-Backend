package com.careerguidance.service;

import com.careerguidance.model.CareerPath;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CareerGuidanceService {

    public CareerPath getCareerPath(
            String educationLevel,
            String stream,
            String interest,
            String preferredPath,
            String careerGoal) {

        String education = safe(educationLevel);
        String studentStream = safe(stream);
        String studentInterest = safe(interest);
        String path = safe(preferredPath);
        String goal = safe(careerGoal);

        /*
         * TECHNOLOGY / SOFTWARE
         */
        if (containsAny(studentInterest, "Technology", "Computers", "Software")
                || containsAny(goal, "Software", "Developer", "Engineer", "IT")) {

            return new CareerPath(
                    "Software Developer / Software Engineer",

                    "A technology career involving software development, "
                            + "problem solving, databases, web applications and software systems.",

                    List.of(
                            "Java or Python",
                            "Data Structures and Algorithms",
                            "SQL and Databases",
                            "Object-Oriented Programming",
                            "Web Development",
                            "Spring Boot / Backend Development",
                            "Git and GitHub"
                    ),

                    List.of(
                            "Programming",
                            "Problem Solving",
                            "Communication",
                            "Debugging",
                            "Database Skills",
                            "Version Control"
                    ),

                    List.of(
                            "Build 3-5 practical projects",
                            "Practice DSA regularly",
                            "Learn Git and GitHub",
                            "Prepare for technical interviews",
                            "Apply for internships"
                    ),

                    List.of(
                            "Learn programming fundamentals",
                            "Learn OOP and DSA",
                            "Learn SQL",
                            "Learn Spring Boot",
                            "Learn React or another frontend technology",
                            "Build full-stack projects",
                            "Prepare resume and GitHub",
                            "Apply for internships and jobs"
                    ),

                    List.of(
                            "Java Documentation",
                            "Spring Boot Documentation",
                            "GitHub",
                            "SQL Documentation"
                    )
            );
        }

        /*
         * BUSINESS
         */
        if (containsAny(studentInterest, "Business", "Entrepreneurship")
                || containsAny(path, "Business")
                || containsAny(goal, "Business", "Entrepreneur")) {

            return new CareerPath(
                    "Business / Entrepreneurship",

                    "A business pathway focused on identifying opportunities, "
                            + "building products or services, managing operations and understanding customers.",

                    List.of(
                            "Business Fundamentals",
                            "Accounting Basics",
                            "Marketing",
                            "Finance Basics",
                            "Entrepreneurship",
                            "Business Communication",
                            "Digital Marketing"
                    ),

                    List.of(
                            "Communication",
                            "Leadership",
                            "Problem Solving",
                            "Financial Awareness",
                            "Marketing",
                            "Decision Making"
                    ),

                    List.of(
                            "Understand a target market",
                            "Study basic finance and accounting",
                            "Develop communication skills",
                            "Learn digital marketing",
                            "Start with a small practical project"
                    ),

                    List.of(
                            "Learn business fundamentals",
                            "Identify a real-world problem",
                            "Research potential customers",
                            "Create a small solution",
                            "Test the idea",
                            "Learn marketing and finance",
                            "Improve the business model"
                    ),

                    List.of(
                            "Startup India",
                            "MSME resources",
                            "Business and entrepreneurship learning resources"
                    )
            );
        }

        /*
         * DEFENCE
         */
        if (containsAny(studentInterest, "Defence", "Army", "Defence Services")
                || containsAny(path, "Defence", "Army")
                || containsAny(goal, "Defence", "Army", "Navy", "Air Force")) {

            return new CareerPath(
                    "Defence Career Path",

                    "A defence-oriented pathway involving preparation for eligible "
                            + "Indian defence services and related opportunities.",

                    List.of(
                            "Mathematics",
                            "General Knowledge",
                            "English",
                            "Reasoning",
                            "General Science",
                            "Current Affairs",
                            "Physical Fitness"
                    ),

                    List.of(
                            "Discipline",
                            "Physical Fitness",
                            "Communication",
                            "Reasoning",
                            "Teamwork",
                            "Leadership"
                    ),

                    List.of(
                            "Check eligibility for the specific entry",
                            "Study the relevant examination syllabus",
                            "Practice aptitude and reasoning",
                            "Maintain physical fitness",
                            "Follow official recruitment notifications"
                    ),

                    List.of(
                            "Complete the required school/college qualification",
                            "Identify suitable defence entry routes",
                            "Prepare the relevant written examination",
                            "Prepare for physical requirements where applicable",
                            "Prepare for selection stages",
                            "Follow official recruitment updates"
                    ),

                    List.of(
                            "Official Indian defence recruitment websites",
                            "Official examination notifications"
                    )
            );
        }

        /*
         * SCIENCE / RESEARCH
         */
        if (containsAny(studentInterest, "Science", "Research")
                || containsAny(goal, "Scientist", "Research")) {

            return new CareerPath(
                    "Science / Research",

                    "A pathway for students interested in scientific study, "
                            + "experimentation, analysis and research.",

                    List.of(
                            "Mathematics",
                            "Physics",
                            "Chemistry",
                            "Biology where applicable",
                            "Statistics",
                            "Programming",
                            "Research Methods"
                    ),

                    List.of(
                            "Analytical Thinking",
                            "Mathematical Skills",
                            "Programming",
                            "Experimentation",
                            "Technical Writing",
                            "Research Skills"
                    ),

                    List.of(
                            "Strengthen mathematics and science fundamentals",
                            "Learn data analysis",
                            "Participate in academic projects",
                            "Read research papers",
                            "Develop technical writing skills"
                    ),

                    List.of(
                            "Build strong science fundamentals",
                            "Complete an appropriate undergraduate degree",
                            "Develop research/project experience",
                            "Consider postgraduate study",
                            "Explore research internships",
                            "Consider doctoral study for research careers"
                    ),

                    List.of(
                            "University research portals",
                            "Scientific journals",
                            "Government research organization websites"
                    )
            );
        }

        /*
         * HIGHER STUDIES
         */
        if (containsAny(path, "Higher Studies", "Master", "M.Tech", "PhD", "Research")
                || containsAny(goal, "Higher Studies", "M.Tech", "Master", "PhD")) {

            return new CareerPath(
                    "Higher Studies",

                    "A higher-education pathway for students who want to deepen "
                            + "their knowledge through postgraduate or research study.",

                    List.of(
                            "Core subject knowledge",
                            "Advanced Mathematics where applicable",
                            "Research Methods",
                            "Programming where applicable",
                            "Academic Writing"
                    ),

                    List.of(
                            "Research",
                            "Analytical Thinking",
                            "Technical Writing",
                            "Communication",
                            "Subject Expertise"
                    ),

                    List.of(
                            "Identify suitable postgraduate programs",
                            "Check eligibility requirements",
                            "Prepare for applicable entrance examinations",
                            "Build academic/project experience",
                            "Research institutions and programs"
                    ),

                    List.of(
                            "Complete current degree",
                            "Select specialization",
                            "Research eligible programs",
                            "Prepare for required entrance process",
                            "Complete postgraduate study",
                            "Consider research or employment"
                    ),

                    List.of(
                            "Official university websites",
                            "Official examination websites",
                            "Government education portals"
                    )
            );
        }

        /*
         * DEFAULT CAREER GUIDANCE
         */
        return new CareerPath(
                "Explore Multiple Career Paths",

                "Your selections do not yet identify one specific pathway. "
                        + "Explore careers based on your subjects, interests, skills, "
                        + "education level and preferred future direction.",

                List.of(
                        "Communication",
                        "Digital Skills",
                        "Basic Mathematics",
                        "Problem Solving",
                        "English",
                        "Computer Fundamentals"
                ),

                List.of(
                        "Communication",
                        "Problem Solving",
                        "Digital Literacy",
                        "Teamwork",
                        "Time Management"
                ),

                List.of(
                        "Identify your strongest subjects",
                        "Explore different career areas",
                        "Try small projects",
                        "Talk to teachers or career mentors",
                        "Compare education requirements before choosing a path"
                ),

                List.of(
                        "Understand your interests",
                        "Identify your strengths",
                        "Explore suitable education pathways",
                        "Develop foundational skills",
                        "Try practical projects",
                        "Review your career options regularly"
                ),

                List.of(
                        "Official education portals",
                        "Official university websites",
                        "Government career resources"
                )
        );
    }

    private boolean containsAny(String value, String... keywords) {

        if (value == null || value.isBlank()) {
            return false;
        }

        String lowerValue = value.toLowerCase();

        for (String keyword : keywords) {
            if (lowerValue.contains(keyword.toLowerCase())) {
                return true;
            }
        }

        return false;
    }

    private String safe(String value) {
        return value == null ? "" : value.trim();
    }
}