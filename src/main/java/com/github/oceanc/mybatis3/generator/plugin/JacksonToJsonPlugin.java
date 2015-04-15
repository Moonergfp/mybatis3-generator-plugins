package com.github.oceanc.mybatis3.generator.plugin;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Created by chengyang
 */
public class JacksonToJsonPlugin extends PluginAdapter {

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        Method method = new Method();
        method.setName("toJson");
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setReturnType(FullyQualifiedJavaType.getStringInstance());
        method.addException(new FullyQualifiedJavaType("java.io.IOException"));
        method.addBodyLine("ObjectMapper mapper = new ObjectMapper();");
        method.addBodyLine("mapper.setTimeZone(TimeZone.getDefault());");
        method.addBodyLine("return mapper.writeValueAsString(this);");
        PluginUtils.addDoc(this.getContext(), method, introspectedTable.getFullyQualifiedTableNameAtRuntime());

        topLevelClass.addImportedType(new FullyQualifiedJavaType("java.io.IOException"));
        topLevelClass.addImportedType(new FullyQualifiedJavaType("com.fasterxml.jackson.databind.ObjectMapper"));
        topLevelClass.addImportedType(new FullyQualifiedJavaType("java.util.TimeZone"));

        topLevelClass.addMethod(method);

        System.out.println("-----------------" + topLevelClass.getType().getShortName() + " add method=toJson implement by Jackson2.");
        return true;
    }

    private final SimpleDateFormat df = new SimpleDateFormat("EEE MMM ww HH:mm:ss z yyyy", Locale.US);

}
