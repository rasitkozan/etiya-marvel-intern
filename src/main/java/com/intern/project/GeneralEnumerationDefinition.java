package com.intern.project;

public class GeneralEnumerationDefinition {
    public GeneralEnumerationDefinition() {
    }

    public static final Boolean STATUS_ACTIVE = true;

    public enum TypeIdShortCode {
        ADMIN("admin"),
        CUSTOMER("cust");

        private final String shortCode;
        TypeIdShortCode(String shortCode) {
            this.shortCode = shortCode;
        }
        public String getShortCode() {
            return shortCode;
        }
    }

    public enum AccountStatusShortCode {
        ACTIVE_USER("actv"),
        PASSIVE_USER("pssv"),
        PENDING_USER("pndg");

        private final String shortCode;
        AccountStatusShortCode(String shortCode) {
            this.shortCode = shortCode;
        }
        public String getShortCode() {
            return shortCode;
        }
    }

}
