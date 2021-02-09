package com.bootcamp.springboot.service;

import com.bootcamp.springboot.model.Setting;
import com.bootcamp.springboot.model.Settings;
import com.bootcamp.springboot.model.SettingsGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class SettingsService {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    public Settings defaultUserProfileSettings() {
        logger.info("Loading Default User Profile Settings...");
        return new Settings(Arrays.asList(customer(), reports(), members()));
    }

    private SettingsGroup customer() {
        logger.info("Load Customer Setting.");
        Setting enableNotification = new Setting("Enable Notification", false);
        Setting enableCaseTracking = new Setting("Enable Case Tracking", false);
        Setting support = new Setting("Support", false);
        return new SettingsGroup("Customer", Arrays.asList(enableNotification, enableCaseTracking, support));
    }

    private SettingsGroup reports() {
        logger.info("Load Reports Setting.");
        Setting generateReports = new Setting("Generate Reports", false);
        Setting enableReportExport = new Setting("Enable Report Export", false);
        Setting allowDataCollection = new Setting("Allow Data Collection", false);
        return new SettingsGroup("Reports", Arrays.asList(generateReports, enableReportExport, allowDataCollection));
    }

    private SettingsGroup members() {
        logger.info("Load Membeers Setting.");
        Setting enableMemberSignup = new Setting("Enable Member Signup", false);
        Setting allowUserFeedback = new Setting("Allow User Feedback", false);
        Setting enableCustomPortal = new Setting("Enable Customer Portal", false);
        return new SettingsGroup("Members", Arrays.asList(enableMemberSignup, allowUserFeedback, enableCustomPortal));
    }
}
