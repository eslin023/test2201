package com.eslin.util;

import com.eslin.service.impl.StudentServiceImpl;

public class ServiceFactory {
    public static Object getService(Object service) {
        return new TransactionInvocationHandler(service).getProxy();
    }
}
