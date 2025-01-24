package org.jobber.data;

import java.util.*;

public abstract class FieldStorage {
    public static String[] firstNames = {
            "Liam", "Emma", "Noah", "Olivia", "Oliver", "Ava", "Elijah", "Sophia",
            "James", "Isabella", "William", "Mia", "Benjamin", "Amelia", "Lucas",
            "Harper", "Henry", "Evelyn", "Alexander", "Abigail", "Sebastian",
            "Ella", "Jackson", "Scarlett", "Aiden", "Grace", "Matthew", "Chloe",
            "Daniel", "Zoey", "Michael", "Luna", "Carter", "Nora", "Owen",
            "Riley", "Wyatt", "Aria", "John", "Aubrey", "Jack", "Lily", "Levi",
            "Sadie", "Anthony", "Mila", "Isaac", "Skylar", "Dylan", "Ella"
    };

    public static String[] lastNames = {
            "Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller",
            "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson",
            "White", "Harris", "Martin", "Thompson", "Garcia", "Martinez",
            "Robinson", "Clark", "Rodriguez", "Lewis", "Lee", "Walker",
            "Hall", "Allen", "Young", "King", "Wright", "Scott", "Torres",
            "Nguyen", "Hill", "Flores", "Green", "Adams", "Nelson", "Baker",
            "Hall", "Rivera", "Campbell", "Mitchell", "Carter", "Roberts",
            "Gomez", "Phillips", "Evans", "Turner"
    };

    public static Map<String, String[]> getStateCitiesMap() {
        Map<String, String[]> statesCitiesMap = new HashMap<>();

        statesCitiesMap.put("Alabama", new String[]{"Birmingham", "Montgomery", "Huntsville"});
        statesCitiesMap.put("Alaska", new String[]{"Anchorage", "Fairbanks", "Juneau"});
        statesCitiesMap.put("Arizona", new String[]{"Phoenix", "Tucson", "Mesa"});
        statesCitiesMap.put("Arkansas", new String[]{"Little Rock", "Fort Smith", "Fayetteville"});
        statesCitiesMap.put("California", new String[]{"Los Angeles", "San Francisco", "San Diego"});
        statesCitiesMap.put("Colorado", new String[]{"Denver", "Colorado Springs", "Aurora"});
        statesCitiesMap.put("Connecticut", new String[]{"Hartford", "New Haven", "Bridgeport"});
        statesCitiesMap.put("Delaware", new String[]{"Wilmington", "Dover", "Newark"});
        statesCitiesMap.put("Florida", new String[]{"Miami", "Orlando", "Tampa"});
        statesCitiesMap.put("Georgia", new String[]{"Atlanta", "Augusta", "Savannah"});
        statesCitiesMap.put("Hawaii", new String[]{"Honolulu", "Hilo", "Kailua"});
        statesCitiesMap.put("Idaho", new String[]{"Boise", "Nampa", "Idaho Falls"});
        statesCitiesMap.put("Illinois", new String[]{"Chicago", "Aurora", "Naperville"});
        statesCitiesMap.put("Indiana", new String[]{"Indianapolis", "Fort Wayne", "Evansville"});
        statesCitiesMap.put("Iowa", new String[]{"Des Moines", "Cedar Rapids", "Davenport"});
        statesCitiesMap.put("Kansas", new String[]{"Wichita", "Topeka", "Overland Park"});
        statesCitiesMap.put("Kentucky", new String[]{"Louisville", "Lexington", "Bowling Green"});
        statesCitiesMap.put("Louisiana", new String[]{"New Orleans", "Baton Rouge", "Shreveport"});
        statesCitiesMap.put("Maine", new String[]{"Portland", "Augusta", "Bangor"});
        statesCitiesMap.put("Maryland", new String[]{"Baltimore", "Columbia", "Silver Spring"});
        statesCitiesMap.put("Massachusetts", new String[]{"Boston", "Worcester", "Springfield"});
        statesCitiesMap.put("Michigan", new String[]{"Detroit", "Grand Rapids", "Ann Arbor"});
        statesCitiesMap.put("Minnesota", new String[]{"Minneapolis", "Saint Paul", "Rochester"});
        statesCitiesMap.put("Mississippi", new String[]{"Jackson", "Gulfport", "Southaven"});
        statesCitiesMap.put("Missouri", new String[]{"Kansas City", "St. Louis", "Springfield"});
        statesCitiesMap.put("Montana", new String[]{"Billings", "Missoula", "Great Falls"});
        statesCitiesMap.put("Nebraska", new String[]{"Omaha", "Lincoln", "Bellevue"});
        statesCitiesMap.put("Nevada", new String[]{"Las Vegas", "Reno", "Sparks"});
        statesCitiesMap.put("New Hampshire", new String[]{"Manchester", "Nashua", "Concord"});
        statesCitiesMap.put("New Jersey", new String[]{"Newark", "Jersey City", "Paterson"});
        statesCitiesMap.put("New Mexico", new String[]{"Albuquerque", "Santa Fe", "Las Cruces"});
        statesCitiesMap.put("New York", new String[]{"New York City", "Buffalo", "Rochester"});
        statesCitiesMap.put("North Carolina", new String[]{"Charlotte", "Raleigh", "Greensboro"});
        statesCitiesMap.put("North Dakota", new String[]{"Fargo", "Bismarck", "Grand Forks"});
        statesCitiesMap.put("Ohio", new String[]{"Columbus", "Cleveland", "Cincinnati"});
        statesCitiesMap.put("Oklahoma", new String[]{"Oklahoma City", "Tulsa", "Norman"});
        statesCitiesMap.put("Oregon", new String[]{"Portland", "Salem", "Eugene"});
        statesCitiesMap.put("Pennsylvania", new String[]{"Philadelphia", "Pittsburgh", "Allentown"});
        statesCitiesMap.put("Rhode Island", new String[]{"Providence", "Warwick", "Cranston"});
        statesCitiesMap.put("South Carolina", new String[]{"Columbia", "Charleston", "Greenville"});
        statesCitiesMap.put("South Dakota", new String[]{"Sioux Falls", "Rapid City", "Aberdeen"});
        statesCitiesMap.put("Tennessee", new String[]{"Nashville", "Memphis", "Knoxville"});
        statesCitiesMap.put("Texas", new String[]{"Houston", "San Antonio", "Dallas"});
        statesCitiesMap.put("Utah", new String[]{"Salt Lake City", "Provo", "West Jordan"});
        statesCitiesMap.put("Vermont", new String[]{"Burlington", "Essex", "South Burlington"});
        statesCitiesMap.put("Virginia", new String[]{"Virginia Beach", "Norfolk", "Chesapeake"});
        statesCitiesMap.put("Washington", new String[]{"Seattle", "Spokane", "Tacoma"});
        statesCitiesMap.put("West Virginia", new String[]{"Charleston", "Huntington", "Morgantown"});
        statesCitiesMap.put("Wisconsin", new String[]{"Milwaukee", "Madison", "Green Bay"});
        statesCitiesMap.put("Wyoming", new String[]{"Cheyenne", "Casper", "Laramie"});

        return statesCitiesMap;
    }

    public static String[] skills = {
            "Communication",
            "Teamwork",
            "Problem Solving",
            "Time Management",
            "Critical Thinking",
            "Adaptability",
            "Leadership",
            "Creativity",
            "Conflict Resolution",
            "Presentation Skills",
            "Interpersonal Skills",
            "Project Management",
            "Analytical Skills",
            "Decision Making",
            "Technical Proficiency",
            "Customer Service",
            "Networking",
            "Negotiation",
            "Attention to Detail",
            "Emotional Intelligence",
            "Data Analysis",
            "Organizational Skills",
            "Research Skills",
            "Sales Skills",
            "Digital Literacy",
            "Innovation",
            "Strategic Planning",
            "Budget Management",
            "Self-Motivation",
            "Cultural Awareness"
    };

    public static String[] degrees = {
            "None",
            "High School / GED",
            "Certificate",
            "Associates",
            "Bachelors",
            "Masters",
            "Doctoral",
            "Post-Doctoral"
    };

    public static String getRandAppliedIds() {
        int randLength = new Random().nextInt(4);
        List<Integer> ids = new ArrayList<>();

        for (int i = 0; i < randLength; i++) {
            int r = new Random().nextInt(10);
            if (!ids.contains(r)) ids.add(r);
        }

        String str = ids.toString();
        return str.substring(1, str.length() - 1);
    }
}
