package oving2;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    private String name;
    private String email;
    private Date date;
    private char gender;
    private static final String STRING_REGEX = "^[a-zA-Z\\s]+$";
    private static final Pattern STRING_PATTERN = Pattern.compile(STRING_REGEX);

    private List<String> domene = Arrays.asList("ad", "ae", "af", "ag", "ai", "al", "am", "ao", "aq", "ar", "as", "at",
            "au", "aw", "ax", "az", "ba", "bb", "bd", "be", "bf", "bg", "bh", "bi", "bj", "bl", "bm", "bn", "bo", "bq",
            "br", "bs", "bt", "bv", "bw", "by", "bz", "ca", "cc", "cd", "cf", "cg", "ch", "ci", "ck", "cl", "cm", "cn",
            "co", "cr", "cu", "cv", "cw", "cx", "cy", "cz", "de", "dj", "dk", "dm", "do", "dz", "ec", "ee", "eg", "eh",
            "er", "es", "et", "fi", "fj", "fk", "fm", "fo", "fr", "ga", "gb", "gd", "ge", "gf", "gg", "gh", "gi", "gl",
            "gm", "gn", "gp", "gq", "gr", "gs", "gt", "gu", "gw", "gy", "hk", "hm", "hn", "hr", "ht", "hu", "id", "ie",
            "il", "im", "in", "io", "iq", "ir", "is", "it", "je", "jm", "jo", "jp", "ke", "kg", "kh", "ki", "km", "kn",
            "kp", "kr", "kw", "ky", "kz", "la", "lb", "lc", "li", "lk", "lr", "ls", "lt", "lu", "lv", "ly", "ma", "mc",
            "md", "me", "mf", "mg", "mh", "mk", "ml", "mm", "mn", "mo", "mp", "mq", "mr", "ms", "mt", "mu", "mv", "mw",
            "mx", "my", "mz", "na", "nc", "ne", "nf", "ng", "ni", "nl", "no", "np", "nr", "nu", "nz", "om", "pa", "pe",
            "pf", "pg", "ph", "pk", "pl", "pm", "pn", "pr", "ps", "pt", "pw", "py", "qa", "re", "ro", "rs", "ru", "rw",
            "sa", "sb", "sc", "sd", "se", "sg", "sh", "si", "sj", "sk", "sl", "sm", "sn", "so", "sr", "ss", "st", "sv",
            "sx", "sy", "sz", "tc", "td", "tf", "tg", "th", "tj", "tk", "tl", "tm", "tn", "to", "tr", "tt", "tv", "tw",
            "tz", "ua", "ug", "um", "us", "uy", "uz", "va", "vc", "ve", "vg", "vi", "vn", "vu", "wf", "ws", "ye", "yt",
            "za", "zm", "zw");

    public String getName() {
        return this.name;
    }

    private static boolean isValid(String input) {
        Matcher matcher = STRING_PATTERN.matcher(input);
        return matcher.matches();
    }

    public void setName(String name) {
        if (name.contains(" ") && (name.substring(name.indexOf(" ") + 1).length() > 1)
                && (name.substring(0, name.indexOf(" ")).length() > 1) && Person.isValid(name)
                && name.split(" ").length == 2) {
            this.name = name;
        } else
            throw new IllegalArgumentException("The name is not valid");
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {

        boolean isValid = false;
        // if (email.contains("@") && (email.split(".").length == 3)
        // && email.substring(0, email.indexOf(".") - 1)
        // .equals((this.name.substring(0, this.name.indexOf(" ") - 1)).toLowerCase()))
        // {
        if (email.contains("@") && email.substring(0, email.indexOf("."))
                .equals((this.name.substring(0, this.name.indexOf(" "))).toLowerCase())) {
            for (String domain : this.domene) {
                if (email.endsWith("." + domain)) {
                    isValid = true;
                    break;
                }

            }
        }

        if (isValid == true) {
            this.email = email;
        } else
            throw new IllegalArgumentException("The email must be on right format");

    }

    public Date getBirthday() {
        return date;
    }

    public void setBirthday(Date date) {
        Date now = new Date();
        if (date.before(now)) {
            this.date = date;
        } else
            throw new IllegalArgumentException("Invalid date");
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == '\0' || gender == 'M' || gender == 'F') {
            this.gender = gender;
        } else
            throw new IllegalArgumentException("Invalid gender");

    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Emilie Lysaker");
        p.setEmail("emilie.hogne@ntnu.no");
        p.setGender('F');
        System.out.println(p);
    }

}
