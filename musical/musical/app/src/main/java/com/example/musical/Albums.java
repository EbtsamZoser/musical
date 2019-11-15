package com.example.musical;

public class Albums {

        private String maintitle;

        private String subtitle;

        private int imgid;

        public Albums(String vTitle, String vSubtitle, int imageResourceId)
        {
            maintitle = vTitle;
            subtitle = vSubtitle;
            imgid = imageResourceId;
        }

        public String getVersionTitle() {
            return maintitle;
        }

        public String getVersionSubtitle() {
            return subtitle;
        }

        public int getImageResourceId() {
            return imgid;
        }


    }


