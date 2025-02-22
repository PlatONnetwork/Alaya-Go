package network.platon.contracts.evm.v0_6_12;

import com.alaya.abi.solidity.EventEncoder;
import com.alaya.abi.solidity.TypeReference;
import com.alaya.abi.solidity.datatypes.Address;
import com.alaya.abi.solidity.datatypes.Bool;
import com.alaya.abi.solidity.datatypes.Event;
import com.alaya.abi.solidity.datatypes.Function;
import com.alaya.abi.solidity.datatypes.Type;
import com.alaya.abi.solidity.datatypes.generated.Uint256;
import com.alaya.crypto.Credentials;
import com.alaya.protocol.Web3j;
import com.alaya.protocol.core.DefaultBlockParameter;
import com.alaya.protocol.core.RemoteCall;
import com.alaya.protocol.core.methods.request.PlatonFilter;
import com.alaya.protocol.core.methods.response.Log;
import com.alaya.protocol.core.methods.response.TransactionReceipt;
import com.alaya.tx.Contract;
import com.alaya.tx.TransactionManager;
import com.alaya.tx.gas.GasProvider;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import rx.Observable;
import rx.functions.Func1;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the com.alaya.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 0.13.2.1.
 */
public class EventCallContract extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610343806100206000396000f3fe608060405234801561001057600080fd5b50600436106100575760003560e01c806336aacafa1461005c5780637b0cb839146100665780639d6d4cde14610084578063b53c846b146100a2578063b7301a1f146100ac575b600080fd5b6100646100ca565b005b61006e6101f3565b6040518082815260200191505060405180910390f35b61008c61024b565b6040518082815260200191505060405180910390f35b6100aa61026c565b005b6100b46102b3565b6040518082815260200191505060405180910390f35b7f9f252e5d94c6346e0073dfdaa81c6bba97bc07b05f8378efc62d77d157e1b011600060405180821515815260200191505060405180910390a17f9f252e5d94c6346e0073dfdaa81c6bba97bc07b05f8378efc62d77d157e1b011600160405180821515815260200191505060405180910390a17ffc3a67c9f0b5967ae4041ed898b05ec1fa49d2a3c22336247201d71be6f9712033604051808273ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390a1600c6040518082815260200191505060405180910390a03373ffffffffffffffffffffffffffffffffffffffff167fe1fffcc4923d04b559f4d29a8bfc6cda04eb5b0d3c460751c2402c5c5cc9109c600c6040518082815260200191505060405180910390a2565b60007ffc3a67c9f0b5967ae4041ed898b05ec1fa49d2a3c22336247201d71be6f9712033604051808273ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390a160018101905090565b6000600181019050806040518082815260200191505060405180910390a090565b600c6040518082815260200191505060405180910390a0600d6040518082815260200191505060405180910390a0600e6040518082815260200191505060405180910390a0565b60003373ffffffffffffffffffffffffffffffffffffffff167fe1fffcc4923d04b559f4d29a8bfc6cda04eb5b0d3c460751c2402c5c5cc9109c600c6040518082815260200191505060405180910390a26001810190509056fea2646970667358221220a043c1e10d0d4810892c4fbce4eb0875b02b717bc802c3ea283b0a35c487430f64736f6c634300060c0033";

    public static final String FUNC_ANONYMOUSEVENT = "anonymousEvent";

    public static final String FUNC_EMITEVENT = "emitEvent";

    public static final String FUNC_INDEXEDEVENT = "indexedEvent";

    public static final String FUNC_TESTBOOL = "testBool";

    public static final String FUNC_TESTMULTIANONYMOUS = "testMultiAnonymous";

    public static final Event ANONYMOUS_EVENT = new Event("Anonymous", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
    ;

    public static final Event ANONYMOUS2_EVENT = new Event("Anonymous2", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
    ;

    public static final Event BOOLEVENT_EVENT = new Event("BoolEvent", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
    ;

    public static final Event DEPOSIT_EVENT = new Event("Deposit", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Uint256>() {}));
    ;

    public static final Event INCREMENT_EVENT = new Event("Increment", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
    ;

    protected EventCallContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    protected EventCallContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }

    public List<AnonymousEventResponse> getAnonymousEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = extractEventParametersWithLog(ANONYMOUS_EVENT, transactionReceipt);
        ArrayList<AnonymousEventResponse> responses = new ArrayList<AnonymousEventResponse>(valueList.size());
        for (EventValuesWithLog eventValues : valueList) {
            AnonymousEventResponse typedResponse = new AnonymousEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse._id = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<AnonymousEventResponse> anonymousEventObservable(PlatonFilter filter) {
        return web3j.platonLogObservable(filter).map(new Func1<Log, AnonymousEventResponse>() {
            @Override
            public AnonymousEventResponse call(Log log) {
                EventValuesWithLog eventValues = extractEventParametersWithLog(ANONYMOUS_EVENT, log);
                AnonymousEventResponse typedResponse = new AnonymousEventResponse();
                typedResponse.log = log;
                typedResponse._id = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<AnonymousEventResponse> anonymousEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(ANONYMOUS_EVENT));
        return anonymousEventObservable(filter);
    }

    public List<Anonymous2EventResponse> getAnonymous2Events(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = extractEventParametersWithLog(ANONYMOUS2_EVENT, transactionReceipt);
        ArrayList<Anonymous2EventResponse> responses = new ArrayList<Anonymous2EventResponse>(valueList.size());
        for (EventValuesWithLog eventValues : valueList) {
            Anonymous2EventResponse typedResponse = new Anonymous2EventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse._id = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<Anonymous2EventResponse> anonymous2EventObservable(PlatonFilter filter) {
        return web3j.platonLogObservable(filter).map(new Func1<Log, Anonymous2EventResponse>() {
            @Override
            public Anonymous2EventResponse call(Log log) {
                EventValuesWithLog eventValues = extractEventParametersWithLog(ANONYMOUS2_EVENT, log);
                Anonymous2EventResponse typedResponse = new Anonymous2EventResponse();
                typedResponse.log = log;
                typedResponse._id = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<Anonymous2EventResponse> anonymous2EventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(ANONYMOUS2_EVENT));
        return anonymous2EventObservable(filter);
    }

    public List<BoolEventEventResponse> getBoolEventEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = extractEventParametersWithLog(BOOLEVENT_EVENT, transactionReceipt);
        ArrayList<BoolEventEventResponse> responses = new ArrayList<BoolEventEventResponse>(valueList.size());
        for (EventValuesWithLog eventValues : valueList) {
            BoolEventEventResponse typedResponse = new BoolEventEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.result = (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<BoolEventEventResponse> boolEventEventObservable(PlatonFilter filter) {
        return web3j.platonLogObservable(filter).map(new Func1<Log, BoolEventEventResponse>() {
            @Override
            public BoolEventEventResponse call(Log log) {
                EventValuesWithLog eventValues = extractEventParametersWithLog(BOOLEVENT_EVENT, log);
                BoolEventEventResponse typedResponse = new BoolEventEventResponse();
                typedResponse.log = log;
                typedResponse.result = (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<BoolEventEventResponse> boolEventEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(BOOLEVENT_EVENT));
        return boolEventEventObservable(filter);
    }

    public List<DepositEventResponse> getDepositEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = extractEventParametersWithLog(DEPOSIT_EVENT, transactionReceipt);
        ArrayList<DepositEventResponse> responses = new ArrayList<DepositEventResponse>(valueList.size());
        for (EventValuesWithLog eventValues : valueList) {
            DepositEventResponse typedResponse = new DepositEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse._from = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse._value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<DepositEventResponse> depositEventObservable(PlatonFilter filter) {
        return web3j.platonLogObservable(filter).map(new Func1<Log, DepositEventResponse>() {
            @Override
            public DepositEventResponse call(Log log) {
                EventValuesWithLog eventValues = extractEventParametersWithLog(DEPOSIT_EVENT, log);
                DepositEventResponse typedResponse = new DepositEventResponse();
                typedResponse.log = log;
                typedResponse._from = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse._value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<DepositEventResponse> depositEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(DEPOSIT_EVENT));
        return depositEventObservable(filter);
    }

    public List<IncrementEventResponse> getIncrementEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = extractEventParametersWithLog(INCREMENT_EVENT, transactionReceipt);
        ArrayList<IncrementEventResponse> responses = new ArrayList<IncrementEventResponse>(valueList.size());
        for (EventValuesWithLog eventValues : valueList) {
            IncrementEventResponse typedResponse = new IncrementEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.who = (String) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<IncrementEventResponse> incrementEventObservable(PlatonFilter filter) {
        return web3j.platonLogObservable(filter).map(new Func1<Log, IncrementEventResponse>() {
            @Override
            public IncrementEventResponse call(Log log) {
                EventValuesWithLog eventValues = extractEventParametersWithLog(INCREMENT_EVENT, log);
                IncrementEventResponse typedResponse = new IncrementEventResponse();
                typedResponse.log = log;
                typedResponse.who = (String) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<IncrementEventResponse> incrementEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(INCREMENT_EVENT));
        return incrementEventObservable(filter);
    }

    public RemoteCall<TransactionReceipt> anonymousEvent() {
        final Function function = new Function(
                FUNC_ANONYMOUSEVENT, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> emitEvent() {
        final Function function = new Function(
                FUNC_EMITEVENT, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> indexedEvent() {
        final Function function = new Function(
                FUNC_INDEXEDEVENT, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> testBool() {
        final Function function = new Function(
                FUNC_TESTBOOL, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> testMultiAnonymous() {
        final Function function = new Function(
                FUNC_TESTMULTIANONYMOUS, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<EventCallContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        return deployRemoteCall(EventCallContract.class, web3j, credentials, contractGasProvider, BINARY,  "", chainId);
    }

    public static RemoteCall<EventCallContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        return deployRemoteCall(EventCallContract.class, web3j, transactionManager, contractGasProvider, BINARY,  "", chainId);
    }

    public static EventCallContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        return new EventCallContract(contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    public static EventCallContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        return new EventCallContract(contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }

    public static class AnonymousEventResponse {
        public Log log;

        public BigInteger _id;
    }

    public static class Anonymous2EventResponse {
        public Log log;

        public BigInteger _id;
    }

    public static class BoolEventEventResponse {
        public Log log;

        public Boolean result;
    }

    public static class DepositEventResponse {
        public Log log;

        public String _from;

        public BigInteger _value;
    }

    public static class IncrementEventResponse {
        public Log log;

        public String who;
    }
}
