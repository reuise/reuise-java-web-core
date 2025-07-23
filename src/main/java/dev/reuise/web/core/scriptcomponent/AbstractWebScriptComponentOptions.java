package dev.reuise.web.core.scriptcomponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.document.ExternalScript;
public abstract class AbstractWebScriptComponentOptions<S extends AbstractWebScriptComponentOptions<S>> implements WebScriptComponentOptions , WebComponentOptions {
    @Override
    public S setExternalScriptOptions(ExternalScript options) {
        setUrl(options.getUrl());
        setLanguage(options.getLanguage());
        setType(options.getType());
        setAsync(options.isAsync());
        setDefer(options.isDefer());
        setCrossOrigin(options.getCrossOrigin());
        return self();
    }

    protected AbstractWebScriptComponentOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public String getUrl() {
        return ((String) (getOptionValue("url")));
    }

    @Override
    public ComponentOption<String> getUrlOption() {
        return ((ComponentOption<String>) (getOption("url")));
    }

    @Override
    public S setUrl(String url) {
        setOption("url", url);
        return self();
    }

    private void setDefaultUrl(String url) {
        setDefaultOption("url", url);
    }

    @Override
    public String getType() {
        return ((String) (getOptionValue("type")));
    }

    @Override
    public ComponentOption<String> getTypeOption() {
        return ((ComponentOption<String>) (getOption("type")));
    }

    @Override
    public S setType(String type) {
        setOption("type", type);
        return self();
    }

    private void setDefaultType(String type) {
        setDefaultOption("type", type);
    }

    @Override
    public String getLanguage() {
        return ((String) (getOptionValue("language")));
    }

    @Override
    public ComponentOption<String> getLanguageOption() {
        return ((ComponentOption<String>) (getOption("language")));
    }

    @Override
    public S setLanguage(String language) {
        setOption("language", language);
        return self();
    }

    private void setDefaultLanguage(String language) {
        setDefaultOption("language", language);
    }

    @Override
    public String getCrossOrigin() {
        return ((String) (getOptionValue("crossOrigin")));
    }

    @Override
    public ComponentOption<String> getCrossOriginOption() {
        return ((ComponentOption<String>) (getOption("crossOrigin")));
    }

    @Override
    public S setCrossOrigin(String crossOrigin) {
        setOption("crossOrigin", crossOrigin);
        return self();
    }

    private void setDefaultCrossOrigin(String crossOrigin) {
        setDefaultOption("crossOrigin", crossOrigin);
    }

    @Override
    public boolean isAsync() {
        return Boolean.TRUE.equals(getOptionValue("async"));
    }

    @Override
    public ComponentOption<Boolean> getAsyncOption() {
        return ((ComponentOption<Boolean>) (getOption("async")));
    }

    @Override
    public S setAsync(Boolean async) {
        setOption("async", async);
        return self();
    }

    private void setDefaultAsync(Boolean async) {
        setDefaultOption("async", async);
    }

    @Override
    public boolean isDefer() {
        return Boolean.TRUE.equals(getOptionValue("defer"));
    }

    @Override
    public ComponentOption<Boolean> getDeferOption() {
        return ((ComponentOption<Boolean>) (getOption("defer")));
    }

    @Override
    public S setDefer(Boolean defer) {
        setOption("defer", defer);
        return self();
    }

    private void setDefaultDefer(Boolean defer) {
        setDefaultOption("defer", defer);
    }

    @Override
    public String getCode() {
        return ((String) (getOptionValue("code")));
    }

    @Override
    public ComponentOption<String> getCodeOption() {
        return ((ComponentOption<String>) (getOption("code")));
    }

    @Override
    public S setCode(String code) {
        setOption("code", code);
        return self();
    }

    private void setDefaultCode(String code) {
        setDefaultOption("code", code);
    }

    protected abstract S self();
}