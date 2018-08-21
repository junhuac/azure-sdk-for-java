/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.graphrbac.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.graphrbac.GraphErrorException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in DeletedApplications.
 */
public class DeletedApplicationsInner {
    /** The Retrofit service to perform REST calls. */
    private DeletedApplicationsService service;
    /** The service client containing this operation class. */
    private GraphRbacManagementClientImpl client;

    /**
     * Initializes an instance of DeletedApplicationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DeletedApplicationsInner(Retrofit retrofit, GraphRbacManagementClientImpl client) {
        this.service = retrofit.create(DeletedApplicationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for DeletedApplications to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DeletedApplicationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.graphrbac.DeletedApplications restore" })
        @POST("{tenantID}/deletedApplications/{objectId}/restore")
        Observable<Response<ResponseBody>> restore(@Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.graphrbac.DeletedApplications get" })
        @GET("{tenantID}/deletedApplications")
        Observable<Response<ResponseBody>> get(@Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Restores the deleted application in the directory.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws GraphErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ApplicationInner object if successful.
     */
    public ApplicationInner restore() {
        return restoreWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Restores the deleted application in the directory.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ApplicationInner> restoreAsync(final ServiceCallback<ApplicationInner> serviceCallback) {
        return ServiceFuture.fromResponse(restoreWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Restores the deleted application in the directory.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationInner object
     */
    public Observable<ApplicationInner> restoreAsync() {
        return restoreWithServiceResponseAsync().map(new Func1<ServiceResponse<ApplicationInner>, ApplicationInner>() {
            @Override
            public ApplicationInner call(ServiceResponse<ApplicationInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Restores the deleted application in the directory.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationInner object
     */
    public Observable<ServiceResponse<ApplicationInner>> restoreWithServiceResponseAsync() {
        return service.restore(this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ApplicationInner>>>() {
                @Override
                public Observable<ServiceResponse<ApplicationInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ApplicationInner> clientResponse = restoreDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ApplicationInner> restoreDelegate(Response<ResponseBody> response) throws GraphErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<ApplicationInner, GraphErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ApplicationInner>() { }.getType())
                .registerError(GraphErrorException.class)
                .build(response);
    }

    /**
     * Gets a list of deleted applications in the directory.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws GraphErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ApplicationListResultInner object if successful.
     */
    public ApplicationListResultInner get() {
        return getWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Gets a list of deleted applications in the directory.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ApplicationListResultInner> getAsync(final ServiceCallback<ApplicationListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Gets a list of deleted applications in the directory.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationListResultInner object
     */
    public Observable<ApplicationListResultInner> getAsync() {
        return getWithServiceResponseAsync().map(new Func1<ServiceResponse<ApplicationListResultInner>, ApplicationListResultInner>() {
            @Override
            public ApplicationListResultInner call(ServiceResponse<ApplicationListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a list of deleted applications in the directory.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationListResultInner object
     */
    public Observable<ServiceResponse<ApplicationListResultInner>> getWithServiceResponseAsync() {
        return service.get(this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ApplicationListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<ApplicationListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ApplicationListResultInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ApplicationListResultInner> getDelegate(Response<ResponseBody> response) throws GraphErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<ApplicationListResultInner, GraphErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ApplicationListResultInner>() { }.getType())
                .registerError(GraphErrorException.class)
                .build(response);
    }

}
