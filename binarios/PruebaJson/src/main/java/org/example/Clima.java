package org.example;

    public class Clima {
        public Double latitude;
        public Double longitude;
        public Double generationtime_ms;
        public Integer utc_offset_seconds;
        public String timezone;
        public String timezone_abbreviation;
        public Integer elevation;


            public static class Current_weather {
                public String time;
                public Integer interval;
                public Integer temperature;
                public Double windspeed;
                public Integer winddirection;
                public Integer is_day;
                public Integer weathercode;


            }
        }


