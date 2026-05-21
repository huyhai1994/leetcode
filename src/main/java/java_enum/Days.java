package java_enum;

public enum Days {
    MONDAY {
        @Override
        public String toString() {
            return "Hello, It's Monday";
        }
    },
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
