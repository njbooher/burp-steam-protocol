package com.nickbooher.steam.util.msg;

import com.google.protobuf.AbstractMessage;
import in.dragonbra.javasteam.util.log.LogManager;
import in.dragonbra.javasteam.util.log.Logger;

import java.lang.reflect.Method;

public class UnifiedMessagesUtil {

    private static final Logger logger = LogManager.getLogger(UnifiedMessagesUtil.class);

    public static String serviceNameForJob(String jobName) {
        String[] splitByDot = jobName.split("\\.");
        return splitByDot[0];
    }

    public static String methodNameForJob(String jobName) {
        String[] splitByDot = jobName.split("\\.");
        String[] splitByHash = splitByDot[1].split("#");
        return splitByHash[0];
    }

    public static Class<?> findServiceInterfaceForJob(String jobName) {

        String serviceName = serviceNameForJob(jobName);

        String[] packagesToSearch = {"custom","steam","webui"};

        Class<?> serviceInterfaceType = null;

        for (String packageToSearch : packagesToSearch) {
            try {
                serviceInterfaceType = Class.forName("com.nickbooher.protos." + packageToSearch + ".services.I" + serviceName);
                break;
            } catch (ClassNotFoundException ignored) {}
        }

        if (serviceInterfaceType == null) {
            // The RPC service implementation was not implemented.
            // Either the .proto is missing, or the service was not converted to an interface yet.
            logger.error("Service Method: " + serviceName + ", was not found");
        }

        return serviceInterfaceType;

    }

    public static Method findMethodForJob(String jobName) {

        Class<?> serviceInterfaceType = findServiceInterfaceForJob(jobName);

        String methodName = methodNameForJob(jobName);

        Method method = null;
        for (Method m : serviceInterfaceType.getDeclaredMethods()) {
            if (m.getName().equals(methodName)) {
                method = m;
            }
        }

        return method;

    }

    public static Class<? extends AbstractMessage> getUMRequestProto(String jobName) {

        Method method = findMethodForJob(jobName);

        Class<? extends AbstractMessage> requestType = null;

        if (method != null) {
            requestType = (Class<? extends AbstractMessage>) method.getParameterTypes()[0];
        }

        return requestType;

    }

    public static Class<? extends AbstractMessage> getUMResponseProto(String jobName) {

        Method method = findMethodForJob(jobName);

        Class<? extends AbstractMessage> responseType = null;

        if (method != null) {
            responseType = (Class<? extends AbstractMessage>) method.getReturnType();
        }

        return responseType;

    }

}
