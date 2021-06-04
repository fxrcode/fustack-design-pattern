package org.itstack.demo.design;

public interface IState {
    Result arraignment(String activityId, Enum<Status> currentStatus);
    Result checkPass(String activityId, Enum<Status> currentStatus);
    Result checkRefuse(String activityId, Enum<Status> currentStatus);
    Result checkRevoke(String activityId, Enum<Status> currentStatus);
    Result close(String activityId, Enum<Status> currentStatus);
    Result open(String activityId, Enum<Status> currentStatus);
    Result doing(String activityId, Enum<Status> currentStatus);
}
