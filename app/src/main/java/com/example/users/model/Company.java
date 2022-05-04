package com.example.users.model;

import org.json.JSONException;
import org.json.JSONObject;

    public class Company {
        private String name;

        private String catchPhrase;

        public Company(JSONObject jCompany) {
            try {
                this.setName(jCompany.getString("name"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            try {
                this.setCatchPhrase(jCompany.getString("catchPhrase"));
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCatchPhrase() {
            return catchPhrase;
        }

        public void setCatchPhrase(String catchPhrase) {
            this.catchPhrase = catchPhrase;
        }

        public String toString() {
            return super.toString();
        }

        public String getFullDescription() {
            return ("name:" + name + "|" + "catchPhrase:" + catchPhrase);
        }
    }

