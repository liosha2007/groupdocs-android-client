package com.github.liosha2007.groupdocs.model;

import java.util.ArrayList;
import java.util.List;

public class UserInfo {
    private String nickname = null;
    private String firstname = null;
    private String lastname = null;
    private String pkey = null;
    private String pswd_salt = null;
    private String claimed_id = null;
    private String token = null;
    private Integer storage = null;
    private List<Integer> photo = new ArrayList<Integer>();
    private Boolean active = null;
    private Boolean trial = null;
    private Boolean news_eanbled = null;
    private Boolean alerts_eanbled = null;
    private Boolean support_eanbled = null;
    private String support_email = null;
    private Boolean annotation_branded = null;
    private Boolean viewer_branded = null;
    private Boolean is_real_time_broadcast_enabled = null;
    private Boolean is_scroll_broadcast_enabled = null;
    private Boolean is_zoom_broadcast_enabled = null;
    private List<Integer> annotation_logo = new ArrayList<Integer>();
    private List<Integer> pointer_tool_cursor = new ArrayList<Integer>();
    private Integer annotation_header_options = null;
    private Boolean is_annotation_navigation_widget_enabled = null;
    private Boolean is_annotation_zoom_widget_enabled = null;
    private Boolean is_annotation_download_widget_enabled = null;
    private Boolean is_annotation_print_widget_enabled = null;
    private Boolean is_annotation_help_widget_enabled = null;
    private Boolean is_right_panel_enabled = null;
    private Boolean is_thumbnails_panel_enabled = null;
    private Boolean is_standard_header_always_shown = null;
    private Boolean is_toolbar_enabled = null;
    private Boolean is_text_annotation_button_enabled = null;
    private Boolean is_rectangle_annotation_button_enabled = null;
    private Boolean is_point_annotation_button_enabled = null;
    private Boolean is_strikeout_annotation_button_enabled = null;
    private Boolean is_polyline_annotation_button_enabled = null;
    private Boolean is_typewriter_annotation_button_enabled = null;
    private Boolean is_watermark_annotation_button_enabled = null;
    private Boolean is_annotation_document_name_shown = null;
    private List<Integer> annotation_navigation_icons = new ArrayList<Integer>();
    private List<Integer> annotation_tool_icons = new ArrayList<Integer>();
    private Integer annotation_background_color = null;
    private List<Integer> viewer_logo = new ArrayList<Integer>();
    private Integer viewer_options = null;
    private Boolean is_viewer_navigation_widget_enabled = null;
    private Boolean is_viewer_zoom_widget_enabled = null;
    private Boolean is_viewer_download_widget_enabled = null;
    private Boolean is_viewer_print_widget_enabled = null;
    private Boolean is_viewer_help_widget_enabled = null;
    private Boolean is_viewer_document_name_shown = null;
    private Boolean isviewer_right_mouse_button_menu_enabled = null;
    private Long signedupOn = null;
    private Long signedinOn = null;
    private Integer signin_count = null;
    private List<RoleInfo> roles = new ArrayList<RoleInfo>();
    private Boolean signature_watermark_enabled = null;
    private Boolean signature_desktop_notifications = null;
    private Integer webhook_notification_retries = null;
    private String webhook_notification_failed_recipients = null;
    private String signature_color = null;
    private Double id = null;
    private String guid = null;
    private String primary_email = null;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPkey() {
        return pkey;
    }

    public void setPkey(String pkey) {
        this.pkey = pkey;
    }

    public String getPswd_salt() {
        return pswd_salt;
    }

    public void setPswd_salt(String pswd_salt) {
        this.pswd_salt = pswd_salt;
    }

    public String getClaimed_id() {
        return claimed_id;
    }

    public void setClaimed_id(String claimed_id) {
        this.claimed_id = claimed_id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    public List<Integer> getPhoto() {
        return photo;
    }

    public void setPhoto(List<Integer> photo) {
        this.photo = photo;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getTrial() {
        return trial;
    }

    public void setTrial(Boolean trial) {
        this.trial = trial;
    }

    public Boolean getNews_eanbled() {
        return news_eanbled;
    }

    public void setNews_eanbled(Boolean news_eanbled) {
        this.news_eanbled = news_eanbled;
    }

    public Boolean getAlerts_eanbled() {
        return alerts_eanbled;
    }

    public void setAlerts_eanbled(Boolean alerts_eanbled) {
        this.alerts_eanbled = alerts_eanbled;
    }

    public Boolean getSupport_eanbled() {
        return support_eanbled;
    }

    public void setSupport_eanbled(Boolean support_eanbled) {
        this.support_eanbled = support_eanbled;
    }

    public String getSupport_email() {
        return support_email;
    }

    public void setSupport_email(String support_email) {
        this.support_email = support_email;
    }

    public Boolean getAnnotation_branded() {
        return annotation_branded;
    }

    public void setAnnotation_branded(Boolean annotation_branded) {
        this.annotation_branded = annotation_branded;
    }

    public Boolean getViewer_branded() {
        return viewer_branded;
    }

    public void setViewer_branded(Boolean viewer_branded) {
        this.viewer_branded = viewer_branded;
    }

    public Boolean getIs_real_time_broadcast_enabled() {
        return is_real_time_broadcast_enabled;
    }

    public void setIs_real_time_broadcast_enabled(Boolean is_real_time_broadcast_enabled) {
        this.is_real_time_broadcast_enabled = is_real_time_broadcast_enabled;
    }

    public Boolean getIs_scroll_broadcast_enabled() {
        return is_scroll_broadcast_enabled;
    }

    public void setIs_scroll_broadcast_enabled(Boolean is_scroll_broadcast_enabled) {
        this.is_scroll_broadcast_enabled = is_scroll_broadcast_enabled;
    }

    public Boolean getIs_zoom_broadcast_enabled() {
        return is_zoom_broadcast_enabled;
    }

    public void setIs_zoom_broadcast_enabled(Boolean is_zoom_broadcast_enabled) {
        this.is_zoom_broadcast_enabled = is_zoom_broadcast_enabled;
    }

    public List<Integer> getAnnotation_logo() {
        return annotation_logo;
    }

    public void setAnnotation_logo(List<Integer> annotation_logo) {
        this.annotation_logo = annotation_logo;
    }

    public List<Integer> getPointer_tool_cursor() {
        return pointer_tool_cursor;
    }

    public void setPointer_tool_cursor(List<Integer> pointer_tool_cursor) {
        this.pointer_tool_cursor = pointer_tool_cursor;
    }

    public Integer getAnnotation_header_options() {
        return annotation_header_options;
    }

    public void setAnnotation_header_options(Integer annotation_header_options) {
        this.annotation_header_options = annotation_header_options;
    }

    public Boolean getIs_annotation_navigation_widget_enabled() {
        return is_annotation_navigation_widget_enabled;
    }

    public void setIs_annotation_navigation_widget_enabled(Boolean is_annotation_navigation_widget_enabled) {
        this.is_annotation_navigation_widget_enabled = is_annotation_navigation_widget_enabled;
    }

    public Boolean getIs_annotation_zoom_widget_enabled() {
        return is_annotation_zoom_widget_enabled;
    }

    public void setIs_annotation_zoom_widget_enabled(Boolean is_annotation_zoom_widget_enabled) {
        this.is_annotation_zoom_widget_enabled = is_annotation_zoom_widget_enabled;
    }

    public Boolean getIs_annotation_download_widget_enabled() {
        return is_annotation_download_widget_enabled;
    }

    public void setIs_annotation_download_widget_enabled(Boolean is_annotation_download_widget_enabled) {
        this.is_annotation_download_widget_enabled = is_annotation_download_widget_enabled;
    }

    public Boolean getIs_annotation_print_widget_enabled() {
        return is_annotation_print_widget_enabled;
    }

    public void setIs_annotation_print_widget_enabled(Boolean is_annotation_print_widget_enabled) {
        this.is_annotation_print_widget_enabled = is_annotation_print_widget_enabled;
    }

    public Boolean getIs_annotation_help_widget_enabled() {
        return is_annotation_help_widget_enabled;
    }

    public void setIs_annotation_help_widget_enabled(Boolean is_annotation_help_widget_enabled) {
        this.is_annotation_help_widget_enabled = is_annotation_help_widget_enabled;
    }

    public Boolean getIs_right_panel_enabled() {
        return is_right_panel_enabled;
    }

    public void setIs_right_panel_enabled(Boolean is_right_panel_enabled) {
        this.is_right_panel_enabled = is_right_panel_enabled;
    }

    public Boolean getIs_thumbnails_panel_enabled() {
        return is_thumbnails_panel_enabled;
    }

    public void setIs_thumbnails_panel_enabled(Boolean is_thumbnails_panel_enabled) {
        this.is_thumbnails_panel_enabled = is_thumbnails_panel_enabled;
    }

    public Boolean getIs_standard_header_always_shown() {
        return is_standard_header_always_shown;
    }

    public void setIs_standard_header_always_shown(Boolean is_standard_header_always_shown) {
        this.is_standard_header_always_shown = is_standard_header_always_shown;
    }

    public Boolean getIs_toolbar_enabled() {
        return is_toolbar_enabled;
    }

    public void setIs_toolbar_enabled(Boolean is_toolbar_enabled) {
        this.is_toolbar_enabled = is_toolbar_enabled;
    }

    public Boolean getIs_text_annotation_button_enabled() {
        return is_text_annotation_button_enabled;
    }

    public void setIs_text_annotation_button_enabled(Boolean is_text_annotation_button_enabled) {
        this.is_text_annotation_button_enabled = is_text_annotation_button_enabled;
    }

    public Boolean getIs_rectangle_annotation_button_enabled() {
        return is_rectangle_annotation_button_enabled;
    }

    public void setIs_rectangle_annotation_button_enabled(Boolean is_rectangle_annotation_button_enabled) {
        this.is_rectangle_annotation_button_enabled = is_rectangle_annotation_button_enabled;
    }

    public Boolean getIs_point_annotation_button_enabled() {
        return is_point_annotation_button_enabled;
    }

    public void setIs_point_annotation_button_enabled(Boolean is_point_annotation_button_enabled) {
        this.is_point_annotation_button_enabled = is_point_annotation_button_enabled;
    }

    public Boolean getIs_strikeout_annotation_button_enabled() {
        return is_strikeout_annotation_button_enabled;
    }

    public void setIs_strikeout_annotation_button_enabled(Boolean is_strikeout_annotation_button_enabled) {
        this.is_strikeout_annotation_button_enabled = is_strikeout_annotation_button_enabled;
    }

    public Boolean getIs_polyline_annotation_button_enabled() {
        return is_polyline_annotation_button_enabled;
    }

    public void setIs_polyline_annotation_button_enabled(Boolean is_polyline_annotation_button_enabled) {
        this.is_polyline_annotation_button_enabled = is_polyline_annotation_button_enabled;
    }

    public Boolean getIs_typewriter_annotation_button_enabled() {
        return is_typewriter_annotation_button_enabled;
    }

    public void setIs_typewriter_annotation_button_enabled(Boolean is_typewriter_annotation_button_enabled) {
        this.is_typewriter_annotation_button_enabled = is_typewriter_annotation_button_enabled;
    }

    public Boolean getIs_watermark_annotation_button_enabled() {
        return is_watermark_annotation_button_enabled;
    }

    public void setIs_watermark_annotation_button_enabled(Boolean is_watermark_annotation_button_enabled) {
        this.is_watermark_annotation_button_enabled = is_watermark_annotation_button_enabled;
    }

    public Boolean getIs_annotation_document_name_shown() {
        return is_annotation_document_name_shown;
    }

    public void setIs_annotation_document_name_shown(Boolean is_annotation_document_name_shown) {
        this.is_annotation_document_name_shown = is_annotation_document_name_shown;
    }

    public List<Integer> getAnnotation_navigation_icons() {
        return annotation_navigation_icons;
    }

    public void setAnnotation_navigation_icons(List<Integer> annotation_navigation_icons) {
        this.annotation_navigation_icons = annotation_navigation_icons;
    }

    public List<Integer> getAnnotation_tool_icons() {
        return annotation_tool_icons;
    }

    public void setAnnotation_tool_icons(List<Integer> annotation_tool_icons) {
        this.annotation_tool_icons = annotation_tool_icons;
    }

    public Integer getAnnotation_background_color() {
        return annotation_background_color;
    }

    public void setAnnotation_background_color(Integer annotation_background_color) {
        this.annotation_background_color = annotation_background_color;
    }

    public List<Integer> getViewer_logo() {
        return viewer_logo;
    }

    public void setViewer_logo(List<Integer> viewer_logo) {
        this.viewer_logo = viewer_logo;
    }

    public Integer getViewer_options() {
        return viewer_options;
    }

    public void setViewer_options(Integer viewer_options) {
        this.viewer_options = viewer_options;
    }

    public Boolean getIs_viewer_navigation_widget_enabled() {
        return is_viewer_navigation_widget_enabled;
    }

    public void setIs_viewer_navigation_widget_enabled(Boolean is_viewer_navigation_widget_enabled) {
        this.is_viewer_navigation_widget_enabled = is_viewer_navigation_widget_enabled;
    }

    public Boolean getIs_viewer_zoom_widget_enabled() {
        return is_viewer_zoom_widget_enabled;
    }

    public void setIs_viewer_zoom_widget_enabled(Boolean is_viewer_zoom_widget_enabled) {
        this.is_viewer_zoom_widget_enabled = is_viewer_zoom_widget_enabled;
    }

    public Boolean getIs_viewer_download_widget_enabled() {
        return is_viewer_download_widget_enabled;
    }

    public void setIs_viewer_download_widget_enabled(Boolean is_viewer_download_widget_enabled) {
        this.is_viewer_download_widget_enabled = is_viewer_download_widget_enabled;
    }

    public Boolean getIs_viewer_print_widget_enabled() {
        return is_viewer_print_widget_enabled;
    }

    public void setIs_viewer_print_widget_enabled(Boolean is_viewer_print_widget_enabled) {
        this.is_viewer_print_widget_enabled = is_viewer_print_widget_enabled;
    }

    public Boolean getIs_viewer_help_widget_enabled() {
        return is_viewer_help_widget_enabled;
    }

    public void setIs_viewer_help_widget_enabled(Boolean is_viewer_help_widget_enabled) {
        this.is_viewer_help_widget_enabled = is_viewer_help_widget_enabled;
    }

    public Boolean getIs_viewer_document_name_shown() {
        return is_viewer_document_name_shown;
    }

    public void setIs_viewer_document_name_shown(Boolean is_viewer_document_name_shown) {
        this.is_viewer_document_name_shown = is_viewer_document_name_shown;
    }

    public Boolean getIsviewer_right_mouse_button_menu_enabled() {
        return isviewer_right_mouse_button_menu_enabled;
    }

    public void setIsviewer_right_mouse_button_menu_enabled(Boolean isviewer_right_mouse_button_menu_enabled) {
        this.isviewer_right_mouse_button_menu_enabled = isviewer_right_mouse_button_menu_enabled;
    }

    public Long getSignedupOn() {
        return signedupOn;
    }

    public void setSignedupOn(Long signedupOn) {
        this.signedupOn = signedupOn;
    }

    public Long getSignedinOn() {
        return signedinOn;
    }

    public void setSignedinOn(Long signedinOn) {
        this.signedinOn = signedinOn;
    }

    public Integer getSignin_count() {
        return signin_count;
    }

    public void setSignin_count(Integer signin_count) {
        this.signin_count = signin_count;
    }

    public List<RoleInfo> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleInfo> roles) {
        this.roles = roles;
    }

    public Boolean getSignature_watermark_enabled() {
        return signature_watermark_enabled;
    }

    public void setSignature_watermark_enabled(Boolean signature_watermark_enabled) {
        this.signature_watermark_enabled = signature_watermark_enabled;
    }

    public Boolean getSignature_desktop_notifications() {
        return signature_desktop_notifications;
    }

    public void setSignature_desktop_notifications(Boolean signature_desktop_notifications) {
        this.signature_desktop_notifications = signature_desktop_notifications;
    }

    public Integer getWebhook_notification_retries() {
        return webhook_notification_retries;
    }

    public void setWebhook_notification_retries(Integer webhook_notification_retries) {
        this.webhook_notification_retries = webhook_notification_retries;
    }

    public String getWebhook_notification_failed_recipients() {
        return webhook_notification_failed_recipients;
    }

    public void setWebhook_notification_failed_recipients(String webhook_notification_failed_recipients) {
        this.webhook_notification_failed_recipients = webhook_notification_failed_recipients;
    }

    public String getSignature_color() {
        return signature_color;
    }

    public void setSignature_color(String signature_color) {
        this.signature_color = signature_color;
    }

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getPrimary_email() {
        return primary_email;
    }

    public void setPrimary_email(String primary_email) {
        this.primary_email = primary_email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserInfo userInfo = (UserInfo) o;

        if (active != null ? !active.equals(userInfo.active) : userInfo.active != null) return false;
        if (alerts_eanbled != null ? !alerts_eanbled.equals(userInfo.alerts_eanbled) : userInfo.alerts_eanbled != null)
            return false;
        if (annotation_background_color != null ? !annotation_background_color.equals(userInfo.annotation_background_color) : userInfo.annotation_background_color != null)
            return false;
        if (annotation_branded != null ? !annotation_branded.equals(userInfo.annotation_branded) : userInfo.annotation_branded != null)
            return false;
        if (annotation_header_options != null ? !annotation_header_options.equals(userInfo.annotation_header_options) : userInfo.annotation_header_options != null)
            return false;
        if (annotation_logo != null ? !annotation_logo.equals(userInfo.annotation_logo) : userInfo.annotation_logo != null)
            return false;
        if (annotation_navigation_icons != null ? !annotation_navigation_icons.equals(userInfo.annotation_navigation_icons) : userInfo.annotation_navigation_icons != null)
            return false;
        if (annotation_tool_icons != null ? !annotation_tool_icons.equals(userInfo.annotation_tool_icons) : userInfo.annotation_tool_icons != null)
            return false;
        if (claimed_id != null ? !claimed_id.equals(userInfo.claimed_id) : userInfo.claimed_id != null) return false;
        if (firstname != null ? !firstname.equals(userInfo.firstname) : userInfo.firstname != null) return false;
        if (guid != null ? !guid.equals(userInfo.guid) : userInfo.guid != null) return false;
        if (id != null ? !id.equals(userInfo.id) : userInfo.id != null) return false;
        if (is_annotation_document_name_shown != null ? !is_annotation_document_name_shown.equals(userInfo.is_annotation_document_name_shown) : userInfo.is_annotation_document_name_shown != null)
            return false;
        if (is_annotation_download_widget_enabled != null ? !is_annotation_download_widget_enabled.equals(userInfo.is_annotation_download_widget_enabled) : userInfo.is_annotation_download_widget_enabled != null)
            return false;
        if (is_annotation_help_widget_enabled != null ? !is_annotation_help_widget_enabled.equals(userInfo.is_annotation_help_widget_enabled) : userInfo.is_annotation_help_widget_enabled != null)
            return false;
        if (is_annotation_navigation_widget_enabled != null ? !is_annotation_navigation_widget_enabled.equals(userInfo.is_annotation_navigation_widget_enabled) : userInfo.is_annotation_navigation_widget_enabled != null)
            return false;
        if (is_annotation_print_widget_enabled != null ? !is_annotation_print_widget_enabled.equals(userInfo.is_annotation_print_widget_enabled) : userInfo.is_annotation_print_widget_enabled != null)
            return false;
        if (is_annotation_zoom_widget_enabled != null ? !is_annotation_zoom_widget_enabled.equals(userInfo.is_annotation_zoom_widget_enabled) : userInfo.is_annotation_zoom_widget_enabled != null)
            return false;
        if (is_point_annotation_button_enabled != null ? !is_point_annotation_button_enabled.equals(userInfo.is_point_annotation_button_enabled) : userInfo.is_point_annotation_button_enabled != null)
            return false;
        if (is_polyline_annotation_button_enabled != null ? !is_polyline_annotation_button_enabled.equals(userInfo.is_polyline_annotation_button_enabled) : userInfo.is_polyline_annotation_button_enabled != null)
            return false;
        if (is_real_time_broadcast_enabled != null ? !is_real_time_broadcast_enabled.equals(userInfo.is_real_time_broadcast_enabled) : userInfo.is_real_time_broadcast_enabled != null)
            return false;
        if (is_rectangle_annotation_button_enabled != null ? !is_rectangle_annotation_button_enabled.equals(userInfo.is_rectangle_annotation_button_enabled) : userInfo.is_rectangle_annotation_button_enabled != null)
            return false;
        if (is_right_panel_enabled != null ? !is_right_panel_enabled.equals(userInfo.is_right_panel_enabled) : userInfo.is_right_panel_enabled != null)
            return false;
        if (is_scroll_broadcast_enabled != null ? !is_scroll_broadcast_enabled.equals(userInfo.is_scroll_broadcast_enabled) : userInfo.is_scroll_broadcast_enabled != null)
            return false;
        if (is_standard_header_always_shown != null ? !is_standard_header_always_shown.equals(userInfo.is_standard_header_always_shown) : userInfo.is_standard_header_always_shown != null)
            return false;
        if (is_strikeout_annotation_button_enabled != null ? !is_strikeout_annotation_button_enabled.equals(userInfo.is_strikeout_annotation_button_enabled) : userInfo.is_strikeout_annotation_button_enabled != null)
            return false;
        if (is_text_annotation_button_enabled != null ? !is_text_annotation_button_enabled.equals(userInfo.is_text_annotation_button_enabled) : userInfo.is_text_annotation_button_enabled != null)
            return false;
        if (is_thumbnails_panel_enabled != null ? !is_thumbnails_panel_enabled.equals(userInfo.is_thumbnails_panel_enabled) : userInfo.is_thumbnails_panel_enabled != null)
            return false;
        if (is_toolbar_enabled != null ? !is_toolbar_enabled.equals(userInfo.is_toolbar_enabled) : userInfo.is_toolbar_enabled != null)
            return false;
        if (is_typewriter_annotation_button_enabled != null ? !is_typewriter_annotation_button_enabled.equals(userInfo.is_typewriter_annotation_button_enabled) : userInfo.is_typewriter_annotation_button_enabled != null)
            return false;
        if (is_viewer_document_name_shown != null ? !is_viewer_document_name_shown.equals(userInfo.is_viewer_document_name_shown) : userInfo.is_viewer_document_name_shown != null)
            return false;
        if (is_viewer_download_widget_enabled != null ? !is_viewer_download_widget_enabled.equals(userInfo.is_viewer_download_widget_enabled) : userInfo.is_viewer_download_widget_enabled != null)
            return false;
        if (is_viewer_help_widget_enabled != null ? !is_viewer_help_widget_enabled.equals(userInfo.is_viewer_help_widget_enabled) : userInfo.is_viewer_help_widget_enabled != null)
            return false;
        if (is_viewer_navigation_widget_enabled != null ? !is_viewer_navigation_widget_enabled.equals(userInfo.is_viewer_navigation_widget_enabled) : userInfo.is_viewer_navigation_widget_enabled != null)
            return false;
        if (is_viewer_print_widget_enabled != null ? !is_viewer_print_widget_enabled.equals(userInfo.is_viewer_print_widget_enabled) : userInfo.is_viewer_print_widget_enabled != null)
            return false;
        if (is_viewer_zoom_widget_enabled != null ? !is_viewer_zoom_widget_enabled.equals(userInfo.is_viewer_zoom_widget_enabled) : userInfo.is_viewer_zoom_widget_enabled != null)
            return false;
        if (is_watermark_annotation_button_enabled != null ? !is_watermark_annotation_button_enabled.equals(userInfo.is_watermark_annotation_button_enabled) : userInfo.is_watermark_annotation_button_enabled != null)
            return false;
        if (is_zoom_broadcast_enabled != null ? !is_zoom_broadcast_enabled.equals(userInfo.is_zoom_broadcast_enabled) : userInfo.is_zoom_broadcast_enabled != null)
            return false;
        if (isviewer_right_mouse_button_menu_enabled != null ? !isviewer_right_mouse_button_menu_enabled.equals(userInfo.isviewer_right_mouse_button_menu_enabled) : userInfo.isviewer_right_mouse_button_menu_enabled != null)
            return false;
        if (lastname != null ? !lastname.equals(userInfo.lastname) : userInfo.lastname != null) return false;
        if (news_eanbled != null ? !news_eanbled.equals(userInfo.news_eanbled) : userInfo.news_eanbled != null)
            return false;
        if (nickname != null ? !nickname.equals(userInfo.nickname) : userInfo.nickname != null) return false;
        if (photo != null ? !photo.equals(userInfo.photo) : userInfo.photo != null) return false;
        if (pkey != null ? !pkey.equals(userInfo.pkey) : userInfo.pkey != null) return false;
        if (pointer_tool_cursor != null ? !pointer_tool_cursor.equals(userInfo.pointer_tool_cursor) : userInfo.pointer_tool_cursor != null)
            return false;
        if (primary_email != null ? !primary_email.equals(userInfo.primary_email) : userInfo.primary_email != null)
            return false;
        if (pswd_salt != null ? !pswd_salt.equals(userInfo.pswd_salt) : userInfo.pswd_salt != null) return false;
        if (roles != null ? !roles.equals(userInfo.roles) : userInfo.roles != null) return false;
        if (signature_color != null ? !signature_color.equals(userInfo.signature_color) : userInfo.signature_color != null)
            return false;
        if (signature_desktop_notifications != null ? !signature_desktop_notifications.equals(userInfo.signature_desktop_notifications) : userInfo.signature_desktop_notifications != null)
            return false;
        if (signature_watermark_enabled != null ? !signature_watermark_enabled.equals(userInfo.signature_watermark_enabled) : userInfo.signature_watermark_enabled != null)
            return false;
        if (signedinOn != null ? !signedinOn.equals(userInfo.signedinOn) : userInfo.signedinOn != null) return false;
        if (signedupOn != null ? !signedupOn.equals(userInfo.signedupOn) : userInfo.signedupOn != null) return false;
        if (signin_count != null ? !signin_count.equals(userInfo.signin_count) : userInfo.signin_count != null)
            return false;
        if (storage != null ? !storage.equals(userInfo.storage) : userInfo.storage != null) return false;
        if (support_eanbled != null ? !support_eanbled.equals(userInfo.support_eanbled) : userInfo.support_eanbled != null)
            return false;
        if (support_email != null ? !support_email.equals(userInfo.support_email) : userInfo.support_email != null)
            return false;
        if (token != null ? !token.equals(userInfo.token) : userInfo.token != null) return false;
        if (trial != null ? !trial.equals(userInfo.trial) : userInfo.trial != null) return false;
        if (viewer_branded != null ? !viewer_branded.equals(userInfo.viewer_branded) : userInfo.viewer_branded != null)
            return false;
        if (viewer_logo != null ? !viewer_logo.equals(userInfo.viewer_logo) : userInfo.viewer_logo != null)
            return false;
        if (viewer_options != null ? !viewer_options.equals(userInfo.viewer_options) : userInfo.viewer_options != null)
            return false;
        if (webhook_notification_failed_recipients != null ? !webhook_notification_failed_recipients.equals(userInfo.webhook_notification_failed_recipients) : userInfo.webhook_notification_failed_recipients != null)
            return false;
        if (webhook_notification_retries != null ? !webhook_notification_retries.equals(userInfo.webhook_notification_retries) : userInfo.webhook_notification_retries != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nickname != null ? nickname.hashCode() : 0;
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (pkey != null ? pkey.hashCode() : 0);
        result = 31 * result + (pswd_salt != null ? pswd_salt.hashCode() : 0);
        result = 31 * result + (claimed_id != null ? claimed_id.hashCode() : 0);
        result = 31 * result + (token != null ? token.hashCode() : 0);
        result = 31 * result + (storage != null ? storage.hashCode() : 0);
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        result = 31 * result + (active != null ? active.hashCode() : 0);
        result = 31 * result + (trial != null ? trial.hashCode() : 0);
        result = 31 * result + (news_eanbled != null ? news_eanbled.hashCode() : 0);
        result = 31 * result + (alerts_eanbled != null ? alerts_eanbled.hashCode() : 0);
        result = 31 * result + (support_eanbled != null ? support_eanbled.hashCode() : 0);
        result = 31 * result + (support_email != null ? support_email.hashCode() : 0);
        result = 31 * result + (annotation_branded != null ? annotation_branded.hashCode() : 0);
        result = 31 * result + (viewer_branded != null ? viewer_branded.hashCode() : 0);
        result = 31 * result + (is_real_time_broadcast_enabled != null ? is_real_time_broadcast_enabled.hashCode() : 0);
        result = 31 * result + (is_scroll_broadcast_enabled != null ? is_scroll_broadcast_enabled.hashCode() : 0);
        result = 31 * result + (is_zoom_broadcast_enabled != null ? is_zoom_broadcast_enabled.hashCode() : 0);
        result = 31 * result + (annotation_logo != null ? annotation_logo.hashCode() : 0);
        result = 31 * result + (pointer_tool_cursor != null ? pointer_tool_cursor.hashCode() : 0);
        result = 31 * result + (annotation_header_options != null ? annotation_header_options.hashCode() : 0);
        result = 31 * result + (is_annotation_navigation_widget_enabled != null ? is_annotation_navigation_widget_enabled.hashCode() : 0);
        result = 31 * result + (is_annotation_zoom_widget_enabled != null ? is_annotation_zoom_widget_enabled.hashCode() : 0);
        result = 31 * result + (is_annotation_download_widget_enabled != null ? is_annotation_download_widget_enabled.hashCode() : 0);
        result = 31 * result + (is_annotation_print_widget_enabled != null ? is_annotation_print_widget_enabled.hashCode() : 0);
        result = 31 * result + (is_annotation_help_widget_enabled != null ? is_annotation_help_widget_enabled.hashCode() : 0);
        result = 31 * result + (is_right_panel_enabled != null ? is_right_panel_enabled.hashCode() : 0);
        result = 31 * result + (is_thumbnails_panel_enabled != null ? is_thumbnails_panel_enabled.hashCode() : 0);
        result = 31 * result + (is_standard_header_always_shown != null ? is_standard_header_always_shown.hashCode() : 0);
        result = 31 * result + (is_toolbar_enabled != null ? is_toolbar_enabled.hashCode() : 0);
        result = 31 * result + (is_text_annotation_button_enabled != null ? is_text_annotation_button_enabled.hashCode() : 0);
        result = 31 * result + (is_rectangle_annotation_button_enabled != null ? is_rectangle_annotation_button_enabled.hashCode() : 0);
        result = 31 * result + (is_point_annotation_button_enabled != null ? is_point_annotation_button_enabled.hashCode() : 0);
        result = 31 * result + (is_strikeout_annotation_button_enabled != null ? is_strikeout_annotation_button_enabled.hashCode() : 0);
        result = 31 * result + (is_polyline_annotation_button_enabled != null ? is_polyline_annotation_button_enabled.hashCode() : 0);
        result = 31 * result + (is_typewriter_annotation_button_enabled != null ? is_typewriter_annotation_button_enabled.hashCode() : 0);
        result = 31 * result + (is_watermark_annotation_button_enabled != null ? is_watermark_annotation_button_enabled.hashCode() : 0);
        result = 31 * result + (is_annotation_document_name_shown != null ? is_annotation_document_name_shown.hashCode() : 0);
        result = 31 * result + (annotation_navigation_icons != null ? annotation_navigation_icons.hashCode() : 0);
        result = 31 * result + (annotation_tool_icons != null ? annotation_tool_icons.hashCode() : 0);
        result = 31 * result + (annotation_background_color != null ? annotation_background_color.hashCode() : 0);
        result = 31 * result + (viewer_logo != null ? viewer_logo.hashCode() : 0);
        result = 31 * result + (viewer_options != null ? viewer_options.hashCode() : 0);
        result = 31 * result + (is_viewer_navigation_widget_enabled != null ? is_viewer_navigation_widget_enabled.hashCode() : 0);
        result = 31 * result + (is_viewer_zoom_widget_enabled != null ? is_viewer_zoom_widget_enabled.hashCode() : 0);
        result = 31 * result + (is_viewer_download_widget_enabled != null ? is_viewer_download_widget_enabled.hashCode() : 0);
        result = 31 * result + (is_viewer_print_widget_enabled != null ? is_viewer_print_widget_enabled.hashCode() : 0);
        result = 31 * result + (is_viewer_help_widget_enabled != null ? is_viewer_help_widget_enabled.hashCode() : 0);
        result = 31 * result + (is_viewer_document_name_shown != null ? is_viewer_document_name_shown.hashCode() : 0);
        result = 31 * result + (isviewer_right_mouse_button_menu_enabled != null ? isviewer_right_mouse_button_menu_enabled.hashCode() : 0);
        result = 31 * result + (signedupOn != null ? signedupOn.hashCode() : 0);
        result = 31 * result + (signedinOn != null ? signedinOn.hashCode() : 0);
        result = 31 * result + (signin_count != null ? signin_count.hashCode() : 0);
        result = 31 * result + (roles != null ? roles.hashCode() : 0);
        result = 31 * result + (signature_watermark_enabled != null ? signature_watermark_enabled.hashCode() : 0);
        result = 31 * result + (signature_desktop_notifications != null ? signature_desktop_notifications.hashCode() : 0);
        result = 31 * result + (webhook_notification_retries != null ? webhook_notification_retries.hashCode() : 0);
        result = 31 * result + (webhook_notification_failed_recipients != null ? webhook_notification_failed_recipients.hashCode() : 0);
        result = 31 * result + (signature_color != null ? signature_color.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (guid != null ? guid.hashCode() : 0);
        result = 31 * result + (primary_email != null ? primary_email.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "nickname='" + nickname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", pkey='" + pkey + '\'' +
                ", pswd_salt='" + pswd_salt + '\'' +
                ", claimed_id='" + claimed_id + '\'' +
                ", token='" + token + '\'' +
                ", storage=" + storage +
                ", photo=" + photo +
                ", active=" + active +
                ", trial=" + trial +
                ", news_eanbled=" + news_eanbled +
                ", alerts_eanbled=" + alerts_eanbled +
                ", support_eanbled=" + support_eanbled +
                ", support_email='" + support_email + '\'' +
                ", annotation_branded=" + annotation_branded +
                ", viewer_branded=" + viewer_branded +
                ", is_real_time_broadcast_enabled=" + is_real_time_broadcast_enabled +
                ", is_scroll_broadcast_enabled=" + is_scroll_broadcast_enabled +
                ", is_zoom_broadcast_enabled=" + is_zoom_broadcast_enabled +
                ", annotation_logo=" + annotation_logo +
                ", pointer_tool_cursor=" + pointer_tool_cursor +
                ", annotation_header_options=" + annotation_header_options +
                ", is_annotation_navigation_widget_enabled=" + is_annotation_navigation_widget_enabled +
                ", is_annotation_zoom_widget_enabled=" + is_annotation_zoom_widget_enabled +
                ", is_annotation_download_widget_enabled=" + is_annotation_download_widget_enabled +
                ", is_annotation_print_widget_enabled=" + is_annotation_print_widget_enabled +
                ", is_annotation_help_widget_enabled=" + is_annotation_help_widget_enabled +
                ", is_right_panel_enabled=" + is_right_panel_enabled +
                ", is_thumbnails_panel_enabled=" + is_thumbnails_panel_enabled +
                ", is_standard_header_always_shown=" + is_standard_header_always_shown +
                ", is_toolbar_enabled=" + is_toolbar_enabled +
                ", is_text_annotation_button_enabled=" + is_text_annotation_button_enabled +
                ", is_rectangle_annotation_button_enabled=" + is_rectangle_annotation_button_enabled +
                ", is_point_annotation_button_enabled=" + is_point_annotation_button_enabled +
                ", is_strikeout_annotation_button_enabled=" + is_strikeout_annotation_button_enabled +
                ", is_polyline_annotation_button_enabled=" + is_polyline_annotation_button_enabled +
                ", is_typewriter_annotation_button_enabled=" + is_typewriter_annotation_button_enabled +
                ", is_watermark_annotation_button_enabled=" + is_watermark_annotation_button_enabled +
                ", is_annotation_document_name_shown=" + is_annotation_document_name_shown +
                ", annotation_navigation_icons=" + annotation_navigation_icons +
                ", annotation_tool_icons=" + annotation_tool_icons +
                ", annotation_background_color=" + annotation_background_color +
                ", viewer_logo=" + viewer_logo +
                ", viewer_options=" + viewer_options +
                ", is_viewer_navigation_widget_enabled=" + is_viewer_navigation_widget_enabled +
                ", is_viewer_zoom_widget_enabled=" + is_viewer_zoom_widget_enabled +
                ", is_viewer_download_widget_enabled=" + is_viewer_download_widget_enabled +
                ", is_viewer_print_widget_enabled=" + is_viewer_print_widget_enabled +
                ", is_viewer_help_widget_enabled=" + is_viewer_help_widget_enabled +
                ", is_viewer_document_name_shown=" + is_viewer_document_name_shown +
                ", isviewer_right_mouse_button_menu_enabled=" + isviewer_right_mouse_button_menu_enabled +
                ", signedupOn=" + signedupOn +
                ", signedinOn=" + signedinOn +
                ", signin_count=" + signin_count +
                ", roles=" + roles +
                ", signature_watermark_enabled=" + signature_watermark_enabled +
                ", signature_desktop_notifications=" + signature_desktop_notifications +
                ", webhook_notification_retries=" + webhook_notification_retries +
                ", webhook_notification_failed_recipients='" + webhook_notification_failed_recipients + '\'' +
                ", signature_color='" + signature_color + '\'' +
                ", id=" + id +
                ", guid='" + guid + '\'' +
                ", primary_email='" + primary_email + '\'' +
                '}';
    }
}

