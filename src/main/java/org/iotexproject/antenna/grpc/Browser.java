/**
 * 
 */
package org.iotexproject.antenna.grpc;

import org.iotexproject.antenna.grpc.iotexapi.APIServiceGrpc;
import org.iotexproject.antenna.grpc.iotexapi.APIServiceGrpc.APIServiceBlockingStub;
import org.iotexproject.antenna.grpc.iotexapi.Api.EstimateGasForActionRequest;
import org.iotexproject.antenna.grpc.iotexapi.Api.EstimateGasForActionResponse;
import org.iotexproject.antenna.grpc.iotexapi.Api.GetAccountRequest;
import org.iotexproject.antenna.grpc.iotexapi.Api.GetAccountResponse;
import org.iotexproject.antenna.grpc.iotexapi.Api.GetActionByHashRequest;
import org.iotexproject.antenna.grpc.iotexapi.Api.GetActionsByBlockRequest;
import org.iotexproject.antenna.grpc.iotexapi.Api.GetActionsByIndexRequest;
import org.iotexproject.antenna.grpc.iotexapi.Api.GetActionsRequest;
import org.iotexproject.antenna.grpc.iotexapi.Api.GetActionsResponse;
import org.iotexproject.antenna.grpc.iotexapi.Api.GetBlockMetaByHashRequest;
import org.iotexproject.antenna.grpc.iotexapi.Api.GetBlockMetasByIndexRequest;
import org.iotexproject.antenna.grpc.iotexapi.Api.GetBlockMetasRequest;
import org.iotexproject.antenna.grpc.iotexapi.Api.GetBlockMetasResponse;
import org.iotexproject.antenna.grpc.iotexapi.Api.GetChainMetaRequest;
import org.iotexproject.antenna.grpc.iotexapi.Api.GetChainMetaResponse;
import org.iotexproject.antenna.grpc.iotexapi.Api.GetEpochMetaRequest;
import org.iotexproject.antenna.grpc.iotexapi.Api.GetEpochMetaResponse;
import org.iotexproject.antenna.grpc.iotexapi.Api.GetReceiptByActionRequest;
import org.iotexproject.antenna.grpc.iotexapi.Api.GetReceiptByActionResponse;
import org.iotexproject.antenna.grpc.iotexapi.Api.GetServerMetaRequest;
import org.iotexproject.antenna.grpc.iotexapi.Api.GetServerMetaResponse;
import org.iotexproject.antenna.grpc.iotexapi.Api.ReadContractRequest;
import org.iotexproject.antenna.grpc.iotexapi.Api.ReadContractResponse;
import org.iotexproject.antenna.grpc.iotexapi.Api.ReadStateRequest;
import org.iotexproject.antenna.grpc.iotexapi.Api.ReadStateResponse;
import org.iotexproject.antenna.grpc.iotexapi.Api.SendActionRequest;
import org.iotexproject.antenna.grpc.iotexapi.Api.SendActionResponse;
import org.iotexproject.antenna.grpc.iotexapi.Api.SuggestGasPriceRequest;
import org.iotexproject.antenna.grpc.iotexapi.Api.SuggestGasPriceResponse;
import org.iotexproject.antenna.grpc.iotextypes.ActionOuterClass.Action;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * Simple GRPC Bridge
 * 
 * @author Fabrizio Spataro <fabryprog@gmail.com>
 *
 */
public class Browser implements IoTeXGRPCInterface {
	private final ManagedChannel channel;
	private final APIServiceBlockingStub blockingStub;
    
	public Browser(final String host, final Integer port) {
		this(ManagedChannelBuilder.forAddress(host, port).usePlaintext());
	}

	public Browser(ManagedChannelBuilder<?> channelBuilder) {
		channel = channelBuilder.build();
		blockingStub = APIServiceGrpc.newBlockingStub(channel);
	}
	
	public GetChainMetaResponse getChainMeta() {
		GetChainMetaRequest req = GetChainMetaRequest.newBuilder().build();
	  	return blockingStub.getChainMeta(req);
	}
	public GetEpochMetaResponse getEpochMeta(Long epoch) {
		GetEpochMetaRequest req = GetEpochMetaRequest.newBuilder().setEpochNumber(epoch).build();
	  	return blockingStub.getEpochMeta(req);
	}
	public GetServerMetaResponse getServerMeta() {
		GetServerMetaRequest req = GetServerMetaRequest.newBuilder().build();
	  	return blockingStub.getServerMeta(req);
	}
	
	public GetBlockMetasResponse getBlockMetasByIndex(final Long start, final Long count) {
		GetBlockMetasByIndexRequest reqIdx = GetBlockMetasByIndexRequest.newBuilder().setStart(start).setCount(count).build();
		GetBlockMetasRequest req = GetBlockMetasRequest.newBuilder().setByIndex(reqIdx).build();
		
		return blockingStub.getBlockMetas(req);
	}
	
	public GetBlockMetasResponse getBlockMetasByHash(final String hash) {
		GetBlockMetaByHashRequest reqHash = GetBlockMetaByHashRequest.newBuilder().setBlkHash(hash).build();
		GetBlockMetasRequest req = GetBlockMetasRequest.newBuilder().setByHash(reqHash).build();
		
		return blockingStub.getBlockMetas(req);
	}

	public GetAccountResponse getAccount(final String address) {
		GetAccountRequest req = GetAccountRequest.newBuilder().setAddress(address).build();
		return blockingStub.getAccount(req);
	}
	
	public SuggestGasPriceResponse getSuggestGasPrice() {
		SuggestGasPriceRequest req = SuggestGasPriceRequest.newBuilder().build();
		return blockingStub.suggestGasPrice(req);
	}
	
	public GetActionsResponse getActionsByIndex(Long start, Long count) {
		GetActionsByIndexRequest reqIdx = GetActionsByIndexRequest.newBuilder().setStart(start).setCount(count).build();
		
		GetActionsRequest req = GetActionsRequest.newBuilder().setByIndex(reqIdx).build();
		return blockingStub.getActions(req);
	}
	
	public GetActionsResponse getActionsByHash(String hash, Boolean checkPending) {
		GetActionByHashRequest reqHash = GetActionByHashRequest.newBuilder().setActionHash(hash).setCheckPending(checkPending).build();
		
		GetActionsRequest req = GetActionsRequest.newBuilder().setByHash(reqHash).build();
		return blockingStub.getActions(req);
	}
	
	public GetActionsResponse getActionsByBlock(String hash, Long start, Long count) {
		GetActionsByBlockRequest reqBlock = GetActionsByBlockRequest.newBuilder().setBlkHash(hash).setStart(start).setCount(count).build();
		
		GetActionsRequest req = GetActionsRequest.newBuilder().setByBlk(reqBlock).build();
		return blockingStub.getActions(req);
	}
	
	public EstimateGasForActionResponse estimateGasForAction(Action action) {
		EstimateGasForActionRequest req = EstimateGasForActionRequest.newBuilder().setAction(action).build();
		
		return blockingStub.estimateGasForAction(req);
	}
	
	public GetReceiptByActionResponse getReceiptByAction(String hash) {
		GetReceiptByActionRequest req = GetReceiptByActionRequest.newBuilder().setActionHash(hash).build();
		
		return blockingStub.getReceiptByAction(req);
	}
	
	public ReadContractResponse readContract(Action action) {
		ReadContractRequest req = ReadContractRequest.newBuilder().setAction(action).build();
		
		return blockingStub.readContract(req);
	}
	
	public void close() {
		channel.shutdownNow();		
	}
}

