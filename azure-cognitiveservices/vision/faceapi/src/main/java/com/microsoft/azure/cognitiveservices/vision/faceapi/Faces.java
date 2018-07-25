/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi;

import com.microsoft.azure.cognitiveservices.vision.faceapi.models.APIErrorException;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.DetectedFace;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.FaceAttributeType;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.FindSimilarMatchMode;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.GroupResult;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.IdentifyResult;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.SimilarFace;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.VerifyResult;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Faces.
 */
public interface Faces {
    /**
     * Given query face's faceId, find the similar-looking faces from a faceId array or a faceListId.
     *
     * @param faceId FaceId of the query face. User needs to call Face - Detect first to get a valid faceId. Note that this faceId is not persisted and will expire 24 hours after the detection call
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;SimilarFace&gt; object if successful.
     */
    List<SimilarFace> findSimilar(UUID faceId);

    /**
     * Given query face's faceId, find the similar-looking faces from a faceId array or a faceListId.
     *
     * @param faceId FaceId of the query face. User needs to call Face - Detect first to get a valid faceId. Note that this faceId is not persisted and will expire 24 hours after the detection call
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<SimilarFace>> findSimilarAsync(UUID faceId, final ServiceCallback<List<SimilarFace>> serviceCallback);

    /**
     * Given query face's faceId, find the similar-looking faces from a faceId array or a faceListId.
     *
     * @param faceId FaceId of the query face. User needs to call Face - Detect first to get a valid faceId. Note that this faceId is not persisted and will expire 24 hours after the detection call
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;SimilarFace&gt; object
     */
    Observable<List<SimilarFace>> findSimilarAsync(UUID faceId);

    /**
     * Given query face's faceId, find the similar-looking faces from a faceId array or a faceListId.
     *
     * @param faceId FaceId of the query face. User needs to call Face - Detect first to get a valid faceId. Note that this faceId is not persisted and will expire 24 hours after the detection call
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;SimilarFace&gt; object
     */
    Observable<ServiceResponse<List<SimilarFace>>> findSimilarWithServiceResponseAsync(UUID faceId);
    /**
     * Given query face's faceId, find the similar-looking faces from a faceId array or a faceListId.
     *
     * @param faceId FaceId of the query face. User needs to call Face - Detect first to get a valid faceId. Note that this faceId is not persisted and will expire 24 hours after the detection call
     * @param faceListId An existing user-specified unique candidate face list, created in Face List - Create a Face List. Face list contains a set of persistedFaceIds which are persisted and will never expire. Parameter faceListId and faceIds should not be provided at the same time
     * @param faceIds An array of candidate faceIds. All of them are created by Face - Detect and the faceIds will expire 24 hours after the detection call.
     * @param maxNumOfCandidatesReturned The number of top similar faces returned. The valid range is [1, 1000].
     * @param mode Similar face searching mode. It can be "matchPerson" or "matchFace". Possible values include: 'matchPerson', 'matchFace'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;SimilarFace&gt; object if successful.
     */
    List<SimilarFace> findSimilar(UUID faceId, String faceListId, List<UUID> faceIds, Integer maxNumOfCandidatesReturned, FindSimilarMatchMode mode);

    /**
     * Given query face's faceId, find the similar-looking faces from a faceId array or a faceListId.
     *
     * @param faceId FaceId of the query face. User needs to call Face - Detect first to get a valid faceId. Note that this faceId is not persisted and will expire 24 hours after the detection call
     * @param faceListId An existing user-specified unique candidate face list, created in Face List - Create a Face List. Face list contains a set of persistedFaceIds which are persisted and will never expire. Parameter faceListId and faceIds should not be provided at the same time
     * @param faceIds An array of candidate faceIds. All of them are created by Face - Detect and the faceIds will expire 24 hours after the detection call.
     * @param maxNumOfCandidatesReturned The number of top similar faces returned. The valid range is [1, 1000].
     * @param mode Similar face searching mode. It can be "matchPerson" or "matchFace". Possible values include: 'matchPerson', 'matchFace'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<SimilarFace>> findSimilarAsync(UUID faceId, String faceListId, List<UUID> faceIds, Integer maxNumOfCandidatesReturned, FindSimilarMatchMode mode, final ServiceCallback<List<SimilarFace>> serviceCallback);

    /**
     * Given query face's faceId, find the similar-looking faces from a faceId array or a faceListId.
     *
     * @param faceId FaceId of the query face. User needs to call Face - Detect first to get a valid faceId. Note that this faceId is not persisted and will expire 24 hours after the detection call
     * @param faceListId An existing user-specified unique candidate face list, created in Face List - Create a Face List. Face list contains a set of persistedFaceIds which are persisted and will never expire. Parameter faceListId and faceIds should not be provided at the same time
     * @param faceIds An array of candidate faceIds. All of them are created by Face - Detect and the faceIds will expire 24 hours after the detection call.
     * @param maxNumOfCandidatesReturned The number of top similar faces returned. The valid range is [1, 1000].
     * @param mode Similar face searching mode. It can be "matchPerson" or "matchFace". Possible values include: 'matchPerson', 'matchFace'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;SimilarFace&gt; object
     */
    Observable<List<SimilarFace>> findSimilarAsync(UUID faceId, String faceListId, List<UUID> faceIds, Integer maxNumOfCandidatesReturned, FindSimilarMatchMode mode);

    /**
     * Given query face's faceId, find the similar-looking faces from a faceId array or a faceListId.
     *
     * @param faceId FaceId of the query face. User needs to call Face - Detect first to get a valid faceId. Note that this faceId is not persisted and will expire 24 hours after the detection call
     * @param faceListId An existing user-specified unique candidate face list, created in Face List - Create a Face List. Face list contains a set of persistedFaceIds which are persisted and will never expire. Parameter faceListId and faceIds should not be provided at the same time
     * @param faceIds An array of candidate faceIds. All of them are created by Face - Detect and the faceIds will expire 24 hours after the detection call.
     * @param maxNumOfCandidatesReturned The number of top similar faces returned. The valid range is [1, 1000].
     * @param mode Similar face searching mode. It can be "matchPerson" or "matchFace". Possible values include: 'matchPerson', 'matchFace'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;SimilarFace&gt; object
     */
    Observable<ServiceResponse<List<SimilarFace>>> findSimilarWithServiceResponseAsync(UUID faceId, String faceListId, List<UUID> faceIds, Integer maxNumOfCandidatesReturned, FindSimilarMatchMode mode);

    /**
     * Divide candidate faces into groups based on face similarity.
     *
     * @param faceIds Array of candidate faceId created by Face - Detect. The maximum is 1000 faces
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GroupResult object if successful.
     */
    GroupResult group(List<UUID> faceIds);

    /**
     * Divide candidate faces into groups based on face similarity.
     *
     * @param faceIds Array of candidate faceId created by Face - Detect. The maximum is 1000 faces
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<GroupResult> groupAsync(List<UUID> faceIds, final ServiceCallback<GroupResult> serviceCallback);

    /**
     * Divide candidate faces into groups based on face similarity.
     *
     * @param faceIds Array of candidate faceId created by Face - Detect. The maximum is 1000 faces
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupResult object
     */
    Observable<GroupResult> groupAsync(List<UUID> faceIds);

    /**
     * Divide candidate faces into groups based on face similarity.
     *
     * @param faceIds Array of candidate faceId created by Face - Detect. The maximum is 1000 faces
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupResult object
     */
    Observable<ServiceResponse<GroupResult>> groupWithServiceResponseAsync(List<UUID> faceIds);

    /**
     * Identify unknown faces from a person group.
     *
     * @param personGroupId PersonGroupId of the target person group, created by PersonGroups.Create
     * @param faceIds Array of query faces faceIds, created by the Face - Detect. Each of the faces are identified independently. The valid number of faceIds is between [1, 10].
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;IdentifyResult&gt; object if successful.
     */
    List<IdentifyResult> identify(String personGroupId, List<UUID> faceIds);

    /**
     * Identify unknown faces from a person group.
     *
     * @param personGroupId PersonGroupId of the target person group, created by PersonGroups.Create
     * @param faceIds Array of query faces faceIds, created by the Face - Detect. Each of the faces are identified independently. The valid number of faceIds is between [1, 10].
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<IdentifyResult>> identifyAsync(String personGroupId, List<UUID> faceIds, final ServiceCallback<List<IdentifyResult>> serviceCallback);

    /**
     * Identify unknown faces from a person group.
     *
     * @param personGroupId PersonGroupId of the target person group, created by PersonGroups.Create
     * @param faceIds Array of query faces faceIds, created by the Face - Detect. Each of the faces are identified independently. The valid number of faceIds is between [1, 10].
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;IdentifyResult&gt; object
     */
    Observable<List<IdentifyResult>> identifyAsync(String personGroupId, List<UUID> faceIds);

    /**
     * Identify unknown faces from a person group.
     *
     * @param personGroupId PersonGroupId of the target person group, created by PersonGroups.Create
     * @param faceIds Array of query faces faceIds, created by the Face - Detect. Each of the faces are identified independently. The valid number of faceIds is between [1, 10].
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;IdentifyResult&gt; object
     */
    Observable<ServiceResponse<List<IdentifyResult>>> identifyWithServiceResponseAsync(String personGroupId, List<UUID> faceIds);
    /**
     * Identify unknown faces from a person group.
     *
     * @param personGroupId PersonGroupId of the target person group, created by PersonGroups.Create
     * @param faceIds Array of query faces faceIds, created by the Face - Detect. Each of the faces are identified independently. The valid number of faceIds is between [1, 10].
     * @param maxNumOfCandidatesReturned The range of maxNumOfCandidatesReturned is between 1 and 5 (default is 1).
     * @param confidenceThreshold Confidence threshold of identification, used to judge whether one face belong to one person. The range of confidenceThreshold is [0, 1] (default specified by algorithm).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;IdentifyResult&gt; object if successful.
     */
    List<IdentifyResult> identify(String personGroupId, List<UUID> faceIds, Integer maxNumOfCandidatesReturned, Double confidenceThreshold);

    /**
     * Identify unknown faces from a person group.
     *
     * @param personGroupId PersonGroupId of the target person group, created by PersonGroups.Create
     * @param faceIds Array of query faces faceIds, created by the Face - Detect. Each of the faces are identified independently. The valid number of faceIds is between [1, 10].
     * @param maxNumOfCandidatesReturned The range of maxNumOfCandidatesReturned is between 1 and 5 (default is 1).
     * @param confidenceThreshold Confidence threshold of identification, used to judge whether one face belong to one person. The range of confidenceThreshold is [0, 1] (default specified by algorithm).
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<IdentifyResult>> identifyAsync(String personGroupId, List<UUID> faceIds, Integer maxNumOfCandidatesReturned, Double confidenceThreshold, final ServiceCallback<List<IdentifyResult>> serviceCallback);

    /**
     * Identify unknown faces from a person group.
     *
     * @param personGroupId PersonGroupId of the target person group, created by PersonGroups.Create
     * @param faceIds Array of query faces faceIds, created by the Face - Detect. Each of the faces are identified independently. The valid number of faceIds is between [1, 10].
     * @param maxNumOfCandidatesReturned The range of maxNumOfCandidatesReturned is between 1 and 5 (default is 1).
     * @param confidenceThreshold Confidence threshold of identification, used to judge whether one face belong to one person. The range of confidenceThreshold is [0, 1] (default specified by algorithm).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;IdentifyResult&gt; object
     */
    Observable<List<IdentifyResult>> identifyAsync(String personGroupId, List<UUID> faceIds, Integer maxNumOfCandidatesReturned, Double confidenceThreshold);

    /**
     * Identify unknown faces from a person group.
     *
     * @param personGroupId PersonGroupId of the target person group, created by PersonGroups.Create
     * @param faceIds Array of query faces faceIds, created by the Face - Detect. Each of the faces are identified independently. The valid number of faceIds is between [1, 10].
     * @param maxNumOfCandidatesReturned The range of maxNumOfCandidatesReturned is between 1 and 5 (default is 1).
     * @param confidenceThreshold Confidence threshold of identification, used to judge whether one face belong to one person. The range of confidenceThreshold is [0, 1] (default specified by algorithm).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;IdentifyResult&gt; object
     */
    Observable<ServiceResponse<List<IdentifyResult>>> identifyWithServiceResponseAsync(String personGroupId, List<UUID> faceIds, Integer maxNumOfCandidatesReturned, Double confidenceThreshold);

    /**
     * Verify whether two faces belong to a same person or whether one face belongs to a person.
     *
     * @param faceId1 FaceId of the first face, comes from Face - Detect
     * @param faceId2 FaceId of the second face, comes from Face - Detect
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VerifyResult object if successful.
     */
    VerifyResult verifyFaceToFace(UUID faceId1, UUID faceId2);

    /**
     * Verify whether two faces belong to a same person or whether one face belongs to a person.
     *
     * @param faceId1 FaceId of the first face, comes from Face - Detect
     * @param faceId2 FaceId of the second face, comes from Face - Detect
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VerifyResult> verifyFaceToFaceAsync(UUID faceId1, UUID faceId2, final ServiceCallback<VerifyResult> serviceCallback);

    /**
     * Verify whether two faces belong to a same person or whether one face belongs to a person.
     *
     * @param faceId1 FaceId of the first face, comes from Face - Detect
     * @param faceId2 FaceId of the second face, comes from Face - Detect
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VerifyResult object
     */
    Observable<VerifyResult> verifyFaceToFaceAsync(UUID faceId1, UUID faceId2);

    /**
     * Verify whether two faces belong to a same person or whether one face belongs to a person.
     *
     * @param faceId1 FaceId of the first face, comes from Face - Detect
     * @param faceId2 FaceId of the second face, comes from Face - Detect
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VerifyResult object
     */
    Observable<ServiceResponse<VerifyResult>> verifyFaceToFaceWithServiceResponseAsync(UUID faceId1, UUID faceId2);

    /**
     * Detect human faces in an image and returns face locations, and optionally with faceIds, landmarks, and attributes.
     *
     * @param url Publicly reachable URL of an image
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;DetectedFace&gt; object if successful.
     */
    List<DetectedFace> detectWithUrl(String url);

    /**
     * Detect human faces in an image and returns face locations, and optionally with faceIds, landmarks, and attributes.
     *
     * @param url Publicly reachable URL of an image
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<DetectedFace>> detectWithUrlAsync(String url, final ServiceCallback<List<DetectedFace>> serviceCallback);

    /**
     * Detect human faces in an image and returns face locations, and optionally with faceIds, landmarks, and attributes.
     *
     * @param url Publicly reachable URL of an image
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DetectedFace&gt; object
     */
    Observable<List<DetectedFace>> detectWithUrlAsync(String url);

    /**
     * Detect human faces in an image and returns face locations, and optionally with faceIds, landmarks, and attributes.
     *
     * @param url Publicly reachable URL of an image
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DetectedFace&gt; object
     */
    Observable<ServiceResponse<List<DetectedFace>>> detectWithUrlWithServiceResponseAsync(String url);
    /**
     * Detect human faces in an image and returns face locations, and optionally with faceIds, landmarks, and attributes.
     *
     * @param url Publicly reachable URL of an image
     * @param returnFaceId A value indicating whether the operation should return faceIds of detected faces.
     * @param returnFaceLandmarks A value indicating whether the operation should return landmarks of the detected faces.
     * @param returnFaceAttributes Analyze and return the one or more specified face attributes in the comma-separated string like "returnFaceAttributes=age,gender". Supported face attributes include age, gender, headPose, smile, facialHair, glasses and emotion. Note that each face attribute analysis has additional computational and time cost.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;DetectedFace&gt; object if successful.
     */
    List<DetectedFace> detectWithUrl(String url, Boolean returnFaceId, Boolean returnFaceLandmarks, List<FaceAttributeType> returnFaceAttributes);

    /**
     * Detect human faces in an image and returns face locations, and optionally with faceIds, landmarks, and attributes.
     *
     * @param url Publicly reachable URL of an image
     * @param returnFaceId A value indicating whether the operation should return faceIds of detected faces.
     * @param returnFaceLandmarks A value indicating whether the operation should return landmarks of the detected faces.
     * @param returnFaceAttributes Analyze and return the one or more specified face attributes in the comma-separated string like "returnFaceAttributes=age,gender". Supported face attributes include age, gender, headPose, smile, facialHair, glasses and emotion. Note that each face attribute analysis has additional computational and time cost.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<DetectedFace>> detectWithUrlAsync(String url, Boolean returnFaceId, Boolean returnFaceLandmarks, List<FaceAttributeType> returnFaceAttributes, final ServiceCallback<List<DetectedFace>> serviceCallback);

    /**
     * Detect human faces in an image and returns face locations, and optionally with faceIds, landmarks, and attributes.
     *
     * @param url Publicly reachable URL of an image
     * @param returnFaceId A value indicating whether the operation should return faceIds of detected faces.
     * @param returnFaceLandmarks A value indicating whether the operation should return landmarks of the detected faces.
     * @param returnFaceAttributes Analyze and return the one or more specified face attributes in the comma-separated string like "returnFaceAttributes=age,gender". Supported face attributes include age, gender, headPose, smile, facialHair, glasses and emotion. Note that each face attribute analysis has additional computational and time cost.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DetectedFace&gt; object
     */
    Observable<List<DetectedFace>> detectWithUrlAsync(String url, Boolean returnFaceId, Boolean returnFaceLandmarks, List<FaceAttributeType> returnFaceAttributes);

    /**
     * Detect human faces in an image and returns face locations, and optionally with faceIds, landmarks, and attributes.
     *
     * @param url Publicly reachable URL of an image
     * @param returnFaceId A value indicating whether the operation should return faceIds of detected faces.
     * @param returnFaceLandmarks A value indicating whether the operation should return landmarks of the detected faces.
     * @param returnFaceAttributes Analyze and return the one or more specified face attributes in the comma-separated string like "returnFaceAttributes=age,gender". Supported face attributes include age, gender, headPose, smile, facialHair, glasses and emotion. Note that each face attribute analysis has additional computational and time cost.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DetectedFace&gt; object
     */
    Observable<ServiceResponse<List<DetectedFace>>> detectWithUrlWithServiceResponseAsync(String url, Boolean returnFaceId, Boolean returnFaceLandmarks, List<FaceAttributeType> returnFaceAttributes);

    /**
     * Verify whether two faces belong to a same person. Compares a face Id with a Person Id.
     *
     * @param faceId FaceId the face, comes from Face - Detect
     * @param personGroupId Using existing personGroupId and personId for fast loading a specified person. personGroupId is created in Person Groups.Create.
     * @param personId Specify a certain person in a person group. personId is created in Persons.Create.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VerifyResult object if successful.
     */
    VerifyResult verifyFaceToPerson(UUID faceId, String personGroupId, UUID personId);

    /**
     * Verify whether two faces belong to a same person. Compares a face Id with a Person Id.
     *
     * @param faceId FaceId the face, comes from Face - Detect
     * @param personGroupId Using existing personGroupId and personId for fast loading a specified person. personGroupId is created in Person Groups.Create.
     * @param personId Specify a certain person in a person group. personId is created in Persons.Create.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VerifyResult> verifyFaceToPersonAsync(UUID faceId, String personGroupId, UUID personId, final ServiceCallback<VerifyResult> serviceCallback);

    /**
     * Verify whether two faces belong to a same person. Compares a face Id with a Person Id.
     *
     * @param faceId FaceId the face, comes from Face - Detect
     * @param personGroupId Using existing personGroupId and personId for fast loading a specified person. personGroupId is created in Person Groups.Create.
     * @param personId Specify a certain person in a person group. personId is created in Persons.Create.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VerifyResult object
     */
    Observable<VerifyResult> verifyFaceToPersonAsync(UUID faceId, String personGroupId, UUID personId);

    /**
     * Verify whether two faces belong to a same person. Compares a face Id with a Person Id.
     *
     * @param faceId FaceId the face, comes from Face - Detect
     * @param personGroupId Using existing personGroupId and personId for fast loading a specified person. personGroupId is created in Person Groups.Create.
     * @param personId Specify a certain person in a person group. personId is created in Persons.Create.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VerifyResult object
     */
    Observable<ServiceResponse<VerifyResult>> verifyFaceToPersonWithServiceResponseAsync(UUID faceId, String personGroupId, UUID personId);

    /**
     * Detect human faces in an image and returns face locations, and optionally with faceIds, landmarks, and attributes.
     *
     * @param image An image stream.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;DetectedFace&gt; object if successful.
     */
    List<DetectedFace> detectWithStream(byte[] image);

    /**
     * Detect human faces in an image and returns face locations, and optionally with faceIds, landmarks, and attributes.
     *
     * @param image An image stream.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<DetectedFace>> detectWithStreamAsync(byte[] image, final ServiceCallback<List<DetectedFace>> serviceCallback);

    /**
     * Detect human faces in an image and returns face locations, and optionally with faceIds, landmarks, and attributes.
     *
     * @param image An image stream.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DetectedFace&gt; object
     */
    Observable<List<DetectedFace>> detectWithStreamAsync(byte[] image);

    /**
     * Detect human faces in an image and returns face locations, and optionally with faceIds, landmarks, and attributes.
     *
     * @param image An image stream.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DetectedFace&gt; object
     */
    Observable<ServiceResponse<List<DetectedFace>>> detectWithStreamWithServiceResponseAsync(byte[] image);
    /**
     * Detect human faces in an image and returns face locations, and optionally with faceIds, landmarks, and attributes.
     *
     * @param image An image stream.
     * @param returnFaceId A value indicating whether the operation should return faceIds of detected faces.
     * @param returnFaceLandmarks A value indicating whether the operation should return landmarks of the detected faces.
     * @param returnFaceAttributes Analyze and return the one or more specified face attributes in the comma-separated string like "returnFaceAttributes=age,gender". Supported face attributes include age, gender, headPose, smile, facialHair, glasses and emotion. Note that each face attribute analysis has additional computational and time cost.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;DetectedFace&gt; object if successful.
     */
    List<DetectedFace> detectWithStream(byte[] image, Boolean returnFaceId, Boolean returnFaceLandmarks, List<FaceAttributeType> returnFaceAttributes);

    /**
     * Detect human faces in an image and returns face locations, and optionally with faceIds, landmarks, and attributes.
     *
     * @param image An image stream.
     * @param returnFaceId A value indicating whether the operation should return faceIds of detected faces.
     * @param returnFaceLandmarks A value indicating whether the operation should return landmarks of the detected faces.
     * @param returnFaceAttributes Analyze and return the one or more specified face attributes in the comma-separated string like "returnFaceAttributes=age,gender". Supported face attributes include age, gender, headPose, smile, facialHair, glasses and emotion. Note that each face attribute analysis has additional computational and time cost.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<DetectedFace>> detectWithStreamAsync(byte[] image, Boolean returnFaceId, Boolean returnFaceLandmarks, List<FaceAttributeType> returnFaceAttributes, final ServiceCallback<List<DetectedFace>> serviceCallback);

    /**
     * Detect human faces in an image and returns face locations, and optionally with faceIds, landmarks, and attributes.
     *
     * @param image An image stream.
     * @param returnFaceId A value indicating whether the operation should return faceIds of detected faces.
     * @param returnFaceLandmarks A value indicating whether the operation should return landmarks of the detected faces.
     * @param returnFaceAttributes Analyze and return the one or more specified face attributes in the comma-separated string like "returnFaceAttributes=age,gender". Supported face attributes include age, gender, headPose, smile, facialHair, glasses and emotion. Note that each face attribute analysis has additional computational and time cost.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DetectedFace&gt; object
     */
    Observable<List<DetectedFace>> detectWithStreamAsync(byte[] image, Boolean returnFaceId, Boolean returnFaceLandmarks, List<FaceAttributeType> returnFaceAttributes);

    /**
     * Detect human faces in an image and returns face locations, and optionally with faceIds, landmarks, and attributes.
     *
     * @param image An image stream.
     * @param returnFaceId A value indicating whether the operation should return faceIds of detected faces.
     * @param returnFaceLandmarks A value indicating whether the operation should return landmarks of the detected faces.
     * @param returnFaceAttributes Analyze and return the one or more specified face attributes in the comma-separated string like "returnFaceAttributes=age,gender". Supported face attributes include age, gender, headPose, smile, facialHair, glasses and emotion. Note that each face attribute analysis has additional computational and time cost.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DetectedFace&gt; object
     */
    Observable<ServiceResponse<List<DetectedFace>>> detectWithStreamWithServiceResponseAsync(byte[] image, Boolean returnFaceId, Boolean returnFaceLandmarks, List<FaceAttributeType> returnFaceAttributes);

}